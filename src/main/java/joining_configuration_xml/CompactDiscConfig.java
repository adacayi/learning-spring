package joining_configuration_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompactDiscConfig {

	@Bean
	public CompactDisc compactDisc() {
		return new Yunus();
	}
}
