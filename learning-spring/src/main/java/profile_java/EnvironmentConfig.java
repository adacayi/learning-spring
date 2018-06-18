package profile_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class EnvironmentConfig {

	@Bean
	@Profile("dev")
	public Greeter greeterDev() {
		return new EnvironmentGreeter("Dev");
	}

	@Bean
	@Profile("prod")
	public Greeter greeterProd() {
		return new EnvironmentGreeter("Prod");
	}
}
