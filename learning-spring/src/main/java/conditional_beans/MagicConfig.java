package conditional_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicConfig {

	@Bean
	public Magical magic() {
		return new Magic();
	}
}
