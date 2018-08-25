package aspect.xml.simple_parameter_multi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"aspect/xml/simple_parameter_multi/config.xml")) {
			MediaPlayer player = context.getBean(MediaPlayer.class);
			player.play("Yunus", 3);
			player.play("Yolcular", 1);
			player.play("Yolcular", 2);
			player.play("Yunus", 3);
		}
	}
}
