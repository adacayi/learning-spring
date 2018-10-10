package property_placeholders_java_explicit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public CompactDisc compactDisc(@Value("${disc.artist}") String artist, @Value("${disc.title}") String title,
                                   @Value("${disc.trackCount}") String trackCount, @Value("${disc.size}") double size) {
        return new Yunus(artist, title, trackCount, size);
    }
}
