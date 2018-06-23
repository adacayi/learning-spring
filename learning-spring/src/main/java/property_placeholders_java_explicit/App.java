package property_placeholders_java_explicit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class App {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "prod,firstMachine");
		Properties properties = System.getProperties();
		try {
			properties.load(Files.newInputStream(Paths.get("src/main/java/property_placeholders_java/app.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			CompactDisc cd = context.getBean(CompactDisc.class);
			cd.play();

			Environment env = context.getEnvironment();
			System.out.println("\nActive Profiles:\n");

			Arrays.asList(env.getActiveProfiles()).forEach(System.out::println);

			System.out.println();

			if (!env.acceptsProfiles("dev"))
				System.out.println("We do not have dev profile");
			if (env.acceptsProfiles("prod"))
				System.out.println("We have prod profile");
			if (env.acceptsProfiles("prod", "firstMachine"))
				System.out.println("We have prod and firstMachine profile");
		}
	}
}
