package conditional_beans;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			Arrays.asList(context.getBeanDefinitionNames()).forEach(b -> {
				if (!b.contains("org.springframework"))
					System.out.println(b);
			});
		}
	}

}
