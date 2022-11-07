package bogus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BogusTests {

    @Test
    @DisplayName("First bogus test")
    void bogus2plus3() {
        assertThat(2 + 3).isEqualTo(5);
    }

    @Test
    @DisplayName("Second bogus test")
    void bogus3plus2() {
        assertThat(3 + 2).isEqualTo(5);
    }

    @Test
    @DisplayName("Failing 2+2 test, just for demos")
    void failing2plus2() {
        assertThat(2 + 2).isEqualTo(5);
    }

}
