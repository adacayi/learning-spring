package scope_prototype_java_proxymode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
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
