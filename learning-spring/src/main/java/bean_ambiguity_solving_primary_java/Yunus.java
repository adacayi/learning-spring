package bean_ambiguity_solving_primary_java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Yunus implements CompactDisc {

	private String artist = "Yunus";
	private String title = "Daglar ile";

	@Override
	public void play() {
		System.out.printf("Playing %s - %s\n", artist, title);
	}

}
