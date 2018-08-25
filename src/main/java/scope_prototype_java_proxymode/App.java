package scope_prototype_java_proxymode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			MediaPlayer player = context.getBean(MediaPlayer.class); // If we set Yunus as prototype and set proxyMode
																		// to TARGET_CLASS, then a proxy to Yunus is
																		// inserted in every injection and when it is
																		// called it will get a bean for Yunus.
			player.play();
			player.play();
		}
	}

}
