package bean_ambiguity_solving_qualifier_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			Meal meal = context.getBean(Meal.class);
			meal.serve();
		}
	}

}
