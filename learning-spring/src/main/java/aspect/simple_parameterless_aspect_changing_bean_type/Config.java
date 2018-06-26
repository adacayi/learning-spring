package aspect.simple_parameterless_aspect_changing_bean_type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public CdPlayer cdPlayer() {
		return new CdPlayer();
	}
}
