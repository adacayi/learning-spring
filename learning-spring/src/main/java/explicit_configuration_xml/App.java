package explicit_configuration_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"explicit_configuration_xml/config.xml")) { // Notice that autowiring does not work. It works when
															// component scan is defined in xml configuration
			MediaPlayer player = (MediaPlayer) context.getBean("cdPlayer");
			player.play();
			// To show c-namespace functionality in xml configuration
			MediaPlayer secondPlayer = (MediaPlayer) context.getBean("mediaPlayerWithc-namespace");
			secondPlayer.play();
		}
	}
}
