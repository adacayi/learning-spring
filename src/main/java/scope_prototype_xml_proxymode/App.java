package scope_prototype_xml_proxymode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "scope_prototype_xml_proxymode/config.xml")) {
            MediaPlayer player = context.getBean(MediaPlayer.class); // If we set Yunus as prototype and set proxyMode
            // to TARGET_CLASS, then a proxy to Yunus is
            // inserted in every injection and when it is
            // called it will get a bean for Yunus.
            // Note that if we breaked at this point, we would see that no Yunus bean has been generated yet. It will be
            // generated when the play() method is called and the proxy calls for the actual Yunus bean.
            player.play();
            player.play();
        }
    }
}
