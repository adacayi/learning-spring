package aspect.simple_parameter_multi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			MediaPlayer player = context.getBean(MediaPlayer.class);
			player.play("Yunus", 3);
			player.play("Yolcular", 1);
			player.play("Yolcular", 2);
			player.play("Yunus", 3);
		}
	}
}
