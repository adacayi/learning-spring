package spel_expressions_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "prod,firstMachine");
		Properties properties = System.getProperties();
		try {
			properties.load(Files.newInputStream(Paths.get("src/main/java/spel_expressions_java/app.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			MediaPlayer player = context.getBean(MediaPlayer.class);
			player.play();
		}
	}
}
