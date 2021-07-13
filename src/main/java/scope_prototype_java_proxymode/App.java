package scope_prototype_java_proxymode;

import static utils.Utils.sleep;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String... args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            // Do not try to debug this to understand the behavior, since each access to prototype in debug mode
            // will generate a new instance of the bean. Just run the main method. Logs are added to make the example
            // clearer.
            log("Application started");
            Disc disc = context.getBean(Disc.class);
            log("First bean acquired");
            disc.play();
            log("First bean play method executed");
            disc = context.getBean(Disc.class);
            log("Second bean acquired");
            disc.play();
            log("Second bean play method executed");
            MediaPlayer player = context.getBean(MediaPlayer.class);
            log("MediaPlayer bean acquired");
            player.play();
            log("MediaPlayer play method executed first time");
            player.play();
            log("MediaPlayer play method executed second time");
        }
    }

    private static void log(String message) {
        System.out.println(message);
        sleep(7000);
    }
}
