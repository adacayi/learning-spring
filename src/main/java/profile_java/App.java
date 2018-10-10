package profile_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.default", "prod,prodMachine1");
        System.setProperty("spring.profiles.active", "dev,firstMachine");

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                EnvironmentConfig.class)) {
            Greeter greeter = context.getBean(Greeter.class);
            System.out.println(greeter.greet());

            ConfigurableEnvironment env = context.getEnvironment();

            System.out.println("Default profiles\n");
            Arrays.asList(env.getDefaultProfiles()).forEach(System.out::println);

            System.out.println("\nActive profiles\n");
            Arrays.asList(env.getActiveProfiles()).forEach(System.out::println);
            System.out.println();

            System.out.printf("Does accept prod: %s \n", env.acceptsProfiles("prod"));
            System.out.printf("Does accept dev: %s \n", env.acceptsProfiles("dev"));
            System.out.printf("Does accept firstMachine: %s \n", env.acceptsProfiles("firstMachine"));
        }
    }

}
