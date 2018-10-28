package aspect.simple_parameter_multi_around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            Performance performance = context.getBean(Performance.class);
            performance.perform("Salih", 3);
        }
    }
}
