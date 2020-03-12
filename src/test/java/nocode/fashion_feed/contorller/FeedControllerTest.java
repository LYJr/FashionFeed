package nocode.fashion_feed.contorller;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
public class FeedControllerTest {

    private static final Logger log =  LoggerFactory.getLogger(FeedControllerTest.class);

    @Test
    public void aa () {
        assertThat("asg").isEqualTo("asg");
    }

}
