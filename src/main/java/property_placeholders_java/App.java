package property_placeholders_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.Properties;

public class App {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        try {
            properties.load(App.class.getResource("app.properties").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            CompactDisc cd = context.getBean(CompactDisc.class);
            cd.play();
        }
    }
}
