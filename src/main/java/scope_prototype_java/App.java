package scope_prototype_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			MediaPlayer player = context.getBean(MediaPlayer.class); // We both need CdPlayer and Yunus to be annotated
																		// with @Scope and setting it to prototype,
																		// because if we only set Yunus as prototype
																		// then it will be injected only once, if we
																		// only set CdPlayer prototype it will inject
																		// the same instance of Yunus twice for two
																		// CdPlayer instances.
			player.play();
			player.play();
			player = context.getBean(MediaPlayer.class);
			player.play();
		}
	}

}
