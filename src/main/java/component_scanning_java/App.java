package component_scanning_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				CDPlayerConfig.class)) {
			CompactDisc disc = context.getBean(CompactDisc.class);
			disc.play();
		}
	}
}
