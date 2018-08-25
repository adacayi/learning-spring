package profile_xml;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("config.xml")
@ActiveProfiles("prod")
public class EnvironmentGreeterTest {

	@Autowired
	private Greeter greeter;

	@Test
	public void devGreeting() {
		Assertions.assertNotNull(greeter);
		String expected = "Welcome to Prod\n";
		String actual = greeter.greet();
		Assertions.assertEquals(expected, actual);
	}
}
