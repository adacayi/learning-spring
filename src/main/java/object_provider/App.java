package object_provider;

import static utils.Utils.getRandomInt;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String... args) {
    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
      // Object provider is another way of getting a bean
      // Object provider beans are defined in Config class
      var discObjectProvider = (ObjectProvider<Disc>) context.getBean("discObjectProvider");
      var mediaPlayerObjectProvider = (ObjectProvider<MediaPlayer>) context.getBean("mediaPlayerObjectProvider");
      var disc = discObjectProvider.getObject();
      disc.play();
      disc = discObjectProvider.getObject();
      disc.play();
      // Object provider is useful to get beans which have constructors with parameters that don't have value at the
      // start of the application. For that case we define that bean with prototype scope and send the values with the
      // object provider. In here CDPlayer scope is defined as prototype.
      // Example for scope prototype can be found in scope_prototype_java
      var id = getRandomInt(1, 100);
      var mediaPlayer = mediaPlayerObjectProvider.getObject(disc, id);
      mediaPlayer.play();
    }
  }
}
