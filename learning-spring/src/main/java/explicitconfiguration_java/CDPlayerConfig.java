package explicitconfiguration_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

	@Bean
	public CompactDisc yunus() {
		return new Yunus();
	}

	@Bean
	public MediaPlayer cDPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
