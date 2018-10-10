package spel_expressions_java;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;
    private LocalDateTime moment;

    @Autowired
    public void insertDisc(@Value("#{yunus}") CompactDisc cd, @Value("#{T(System).currentTimeMillis()}") long time) {
        //@Value("#{yunus}") CompactDisc cd makes yunus bean to be injected instead of yansimalar.
        this.cd = cd;
        Instant instant = Instant.ofEpochMilli(time);
        moment = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    @Override
    public void play() {
        System.out.printf("Player powered at %s\n", moment);

        if (cd == null)
            System.out.println("No disc inserted");
        else
            cd.play();
    }

}
