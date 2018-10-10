package scope_prototype_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String... args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            Disc disc = context.getBean(Disc.class);
            disc.play();
            disc = context.getBean(Disc.class);
            disc.play();
        }
    }
}
