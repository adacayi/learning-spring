package bean_ambiguity_solving_primary_java_explicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	@Bean
	public MediaPlayer mediaPlayer() {
		return new CdPlayer();
	}

	@Bean
	@Primary
	public CompactDisc yunus() {
		return new Yunus();
	}

	@Bean
	public CompactDisc yolcular() {
		return new Yolcular();
	}
}
