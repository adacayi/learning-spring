package object_provider;

import org.springframework.stereotype.Component;

@Component
public class Yunus implements Disc {

  private int id;
  private static int lastId = 1;
  private static final Object lockObject = new Object();

  {
    synchronized (lockObject) {
      id = lastId++;
    }
    System.out.printf("%d Yunus generated\n", id);
  }

  @Override
  public void play() {
    System.out.printf("Playing Yunus %d\n", id);
  }
}
