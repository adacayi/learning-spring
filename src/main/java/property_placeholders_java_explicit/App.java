package property_placeholders_java_explicit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class App {

    public static void main(String[] args) {
        try {
            System.getProperties().load(App.class.getResource("app.properties").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            CompactDisc cd = context.getBean(CompactDisc.class);
            cd.play();
        }
    }
}
