package propertysource_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			CompactDisc cd = context.getBean(CompactDisc.class);
			cd.play();
		}
	}
}
