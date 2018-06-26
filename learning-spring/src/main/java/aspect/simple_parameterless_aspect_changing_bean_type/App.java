package aspect.simple_parameterless_aspect_changing_bean_type;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			CompactDisc cd = context.getBean(CompactDisc.class);
			// Yunus yunus = context.getBean(Yunus.class);
			// it would give runtime error
			// No qualifying bean of type
			// 'aspect.simple_parameterless_aspect_changing_bean_type.Yunus' available
			// That is because when we define aspect on CompactDisc (even if we defined it
			// on Yunus directly) it will generate the bean class (which will be a proxy)
			// implementing the interface Yunus implemented, which is CompactDisc.
			Class<?> disc = cd.getClass();
			System.out.printf("\nClass of the bean generated: %s\n", disc.getName());
			System.out.println("\nMethods of the bean class:\n");
			Arrays.asList(disc.getDeclaredMethods()).forEach(System.out::println);
			System.out.println();
			cd.play();
		}
	}

}
