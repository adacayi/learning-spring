package profile_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.default", "prod");
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				EnvironmentConfig.class)) {
			Greeter greeter = context.getBean(Greeter.class);
			System.out.println(greeter.greet());
		}
	}

}
