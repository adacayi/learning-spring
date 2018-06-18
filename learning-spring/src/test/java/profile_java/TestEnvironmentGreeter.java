package profile_java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EnvironmentConfig.class)
@ActiveProfiles("dev")
public class TestEnvironmentGreeter {

	@Autowired
	private Greeter greeter;

	@Test
	public void devGreeting() {
		Assertions.assertNotNull(greeter);
		String expected = "Welcome to Dev\n";
		String actual = greeter.greet();
		Assertions.assertEquals(expected, actual);
	}
}
