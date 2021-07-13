package object_provider;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CDPlayer implements MediaPlayer {

  private Disc cd;
  private int id;

  public CDPlayer(Disc cd,int id) {
    this.cd = cd;
    this.id=id;
  }

  @Override
  public void play() {
    System.out.println("Player id: "+id);
    if (cd == null) {
      System.out.println("Insert disc");
      return;
    }

    System.out.println("CD Player started");
    cd.play();
  }
}
