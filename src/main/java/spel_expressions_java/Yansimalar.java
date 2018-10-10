package spel_expressions_java;

import org.springframework.stereotype.Component;

@Component
public class Yansimalar implements CompactDisc {

    @Override
    public void play() {
        System.out.printf("Playing Yansimalar");
    }
}
