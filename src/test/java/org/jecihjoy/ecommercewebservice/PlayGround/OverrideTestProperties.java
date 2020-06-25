package org.jecihjoy.ecommercewebservice.PlayGround;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@TestPropertySource(properties = {"user=john-doe"})
public class OverrideTestProperties {

    @Value("${user}")
    private String user;

    @Test
    public void whenPropertyProvided_thenProperlyInjected() {
        assertThat(user, equalTo("john-doe"));
    }

}
