package aspect.simple_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public Audience audience() {
		return new Audience();
	}

	@Bean
	public TravellerIntroducer travellerIntroducer() {
		return new TravellerIntroducer();
	}
}
