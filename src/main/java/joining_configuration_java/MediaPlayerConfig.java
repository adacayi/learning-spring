package joining_configuration_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MediaPlayerConfig {

	@Bean
	public MediaPlayer mediaPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
