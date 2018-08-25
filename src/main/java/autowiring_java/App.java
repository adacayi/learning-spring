package autowiring_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				Config.class)) {
			MediaPlayer player = context.getBean(MediaPlayer.class);
			player.play();
		}
	}
}
