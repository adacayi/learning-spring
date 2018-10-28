package property_source_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/property_source_java/app.properties")
public class Config {
    //PropertySource does not add properties to system properties. Hence we cannot see these properties by env.getSystemProperties();
    @Bean
    public CompactDisc compactDisc(Environment env) throws ClassNotFoundException {
        String artist = env.getProperty("disc.artist", "No artist");
        String title = env.getProperty("disc.title", "No title");
        int trackCount = env.getProperty("disc.trackCount", Integer.class, 0);
        double size = env.getProperty("disc.size", Double.class, 0.);
        String discClassName = env.getProperty("disc.class");
        @SuppressWarnings("unchecked")
        Class<?> discClass = Class.forName(discClassName);
        return new Yunus(artist, title, trackCount, size, discClass);
    }
}
