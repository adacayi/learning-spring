package scope_prototype_java_proxymode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private Disc cd;

    @Autowired
    public void insertCD(Disc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        if(cd==null)
        {
            System.out.println("Insert disc");
            return;
        }

        System.out.println("CD Player started");
        cd.play();
    }
}
