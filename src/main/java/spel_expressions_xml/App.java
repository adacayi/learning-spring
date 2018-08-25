package spel_expressions_xml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		try {
			properties.load(Files.newInputStream(Paths.get("src/main/java/spel_expressions_java/app.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spel_expressions_xml/config.xml")) {
			MediaPlayer player = context.getBean(MediaPlayer.class);
			player.play();
		}
	}
}
