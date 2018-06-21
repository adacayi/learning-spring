package propertysource_java;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class App {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "prod,firstMachine");
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			CompactDisc cd = context.getBean(CompactDisc.class);
			cd.play();

			Environment env = cd.getEnvironment();
			System.out.println("\nActive Profiles:\n");

			Arrays.asList(env.getActiveProfiles()).forEach(System.out::println);

			if (!env.acceptsProfiles("dev"))
				System.out.println("We do not have dev profile");
			if (env.acceptsProfiles("prod"))
				System.out.println("We have prod profile");
			if (env.acceptsProfiles("prod", "firstMachine"))
				System.out.println("We have prod and firstMachine profile");
		}
	}
}
