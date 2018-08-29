package property_placeholders_xml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class App {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		try {
			properties.load(App.class.getResource("app.properties").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"property_placeholders_xml/config.xml")) {
			CompactDisc cd = context.getBean(CompactDisc.class);
			cd.play();
		}
	}
}
