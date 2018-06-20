package scope_prototype_java_proxymode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Yunus implements CompactDisc {

	private String title = "Daglar ile";
	private String artist = "Yunus";
	private int id;
	private static int lastId = 1;

	private static Object lockObject = new Object();

	public Yunus() {
		synchronized (lockObject) {
			id = lastId;
			lastId++;
		}
	}

	@Override
	public void play() {
		System.out.printf("Playing %d- %s - %s\n", id, artist, title);

	}

}
