package joining_configuration_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"joining_configuration_xml/springConfiguration.xml")) {
			MediaPlayer player = context.getBean(MediaPlayer.class);
			player.play();
		}
	}
}
