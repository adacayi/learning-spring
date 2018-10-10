package scope_prototype_java_proxymode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String... args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            Disc disc = context.getBean(Disc.class);
            disc.play();
            disc = context.getBean(Disc.class);
            disc.play();
            MediaPlayer player = context.getBean(MediaPlayer.class);
            player.play();
            player.play();
        }
    }
}
