package object_provider;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
  @Autowired
  public ObjectProvider<Disc> discObjectProvider;

  @Autowired
  public ObjectProvider<MediaPlayer> mediaPlayerObjectProvider;

  @Bean
  public ObjectProvider<Disc> discObjectProvider() {
    return discObjectProvider;
  }

  @Bean
  public ObjectProvider<MediaPlayer> mediaPlayerObjectProvider() {
    return mediaPlayerObjectProvider;
  }
}
