package stringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    void string_split() {
        // given
        // when
        // then
        assertThat("1".split(",")).isEqualTo(new String[] {"1"});
        assertThat("1,2".split(",")).isEqualTo(new String[] {"1", "2"});
    }
}
