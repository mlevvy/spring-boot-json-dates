package io.lewandowski.io.lewandowski.tutorial.spring.jsonformatting.jsonformatting;

import io.lewandowski.tutorial.spring.jsonformatting.Application;
import io.lewandowski.tutorial.spring.jsonformatting.Clock;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import static org.springframework.http.HttpStatus.OK;
import static org.testng.AssertJUnit.assertEquals;

@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
public class ControllerTest extends AbstractTestNGSpringContextTests {

    private RestTemplate sut = new RestTemplate();

    @Test
    public void dateTimeFormatterTest() {
        Clock c = new Clock();

        ResponseEntity<Clock> resp = sut.getForEntity("http://localhost:8080/clock", Clock.class);

        assertEquals(OK, resp.getStatusCode());
        assertEquals(c.getLocalDate(), resp.getBody().getLocalDate());
        assertEquals(c.getLocalTime(), resp.getBody().getLocalTime());
        assertEquals(c.getLocalDateTime(), resp.getBody().getLocalDateTime());
    }

}
