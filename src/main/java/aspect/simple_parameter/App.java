package aspect.simple_parameter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			CompactDisc cd = context.getBean(CompactDisc.class);
			cd.playTrack(1);
			cd.playTrack(2);
			cd.playTrack(2);
			cd.playAll();// Notice that track counting in the aspect does not work here since the
							// playTrack method is called within the bean
		}
	}
}
