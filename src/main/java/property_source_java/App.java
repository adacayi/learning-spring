package property_source_java;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class App {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod,firstMachine");
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            CompactDisc cd = context.getBean(CompactDisc.class);
            cd.play();

            Environment env = cd.getEnvironment();
            System.out.println("\nActive Profiles:\n");
            Arrays.asList(env.getActiveProfiles()).forEach(System.out::println);
            env = context.getEnvironment();
            System.out.println("\nActive Profiles:\n");
            Arrays.asList(env.getActiveProfiles()).forEach(System.out::println);
        }
    }
}
