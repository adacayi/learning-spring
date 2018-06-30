package autowiring_java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class CDPlayerTestWithApplicationContext {
	// We will get the MediaPlayer bean from the Application Context
	MediaPlayer player;
	@Autowired
	ApplicationContext context;

	@Rule
	public final SystemOutRule logger = new SystemOutRule();// To use this go to
															// https://stefanbirkner.github.io/system-rules/download.html
															// and download the maven dependency. This enables us to
															// check console outputs.

	@Test
	public void playerNotNull() {
		player = context.getBean(MediaPlayer.class);
		Assertions.assertNotNull(player);
		logger.enableLog();
		player.play();
		String expected = CDPlayer.play + Yunus.play;
		String actual = logger.getLogWithNormalizedLineSeparator();
		Assertions.assertEquals(expected, actual);
	}
}
