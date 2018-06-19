package autowiring_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring_xml/config.xml")) {
			MediaPlayer player = context.getBean(MediaPlayer.class);
			player.play();
		}
	}
}
