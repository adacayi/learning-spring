package propertysource_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/propertysource_java/app.properties")
public class Config {

	@Autowired
	private Environment env;

	@Bean
	public CompactDisc compactDisc() throws ClassNotFoundException {
		String artist = env.getProperty("disc.artist", "No artist");
		String title = env.getProperty("disc.title", "No title");
		int trackCount = env.getProperty("disc.trackCount", Integer.class, 0);
		String discClassName = env.getProperty("disc.class");
		@SuppressWarnings("unchecked")
		Class<CompactDisc> discClass = (Class<CompactDisc>) Class.forName(discClassName);
		return new Yunus(artist, title, trackCount, discClass, env);
	}
}
