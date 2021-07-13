package utils;

public class Utils {

  private Utils() {

  }

  public static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static int getRandomInt(int a, int b) {
    return (int) (Math.random() * (b - a + 1) + a);
  }
}
