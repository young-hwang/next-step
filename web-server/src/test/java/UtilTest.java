import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

class UtilTest {
    @Test
    void given_Line_then_return_path() {
        // given
        String line = "GET /index.html HTTP/1.1";
        // when
        String result = Util.getUrl(line);
        // then
        assertThat(result).isEqualTo("/index.html");
    }
}