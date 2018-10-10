package scope_prototype_java;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
