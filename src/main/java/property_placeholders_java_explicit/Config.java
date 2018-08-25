package property_placeholders_java_explicit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class Config {
	@Bean
	public CompactDisc compactDisc(@Value("${disc.artist}") String artist, @Value("${disc.title}") String title,
			@Value("${disc.trackCount}") String trackCount) {
		return new Yunus(artist, title, trackCount);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
