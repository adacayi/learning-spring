package explicitconfiguration_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	@Bean
	public MediaPlayer cDPlayer() {
		return new CDPlayer();
	}

	@Bean
	public CompactDisc yunus() {
		return new Yunus();
	}
}
