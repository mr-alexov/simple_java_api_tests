package api;

import io.restassured.response.Response;
import models.user.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RegresInTests {


    @BeforeAll
    void setUp() {
        baseURI = "https://reqres.in/api";
    }

    @Test
    void testUser2FirstName() {
        Response response = given().get("/users/2").then().log().all().extract().response();
        User secondUser = response.as(User.class);
        assertThat(secondUser.data.first_name).isEqualTo("Janet");
    }

    @Test
    void testUnknownReturns404() {
        given().get("/unknown/23").then().log().all().statusCode(403);
    }
}
