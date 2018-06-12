package explicitconfiguration_java;

import org.springframework.stereotype.Component;

@Component
public class Yunus implements CompactDisc {
	private static String artist = "Yunus";
	private static String title = "Daglar ile";
	public static String play = String.format("Playing %s - %s\n", artist, title);

	public void play() {
		System.out.print(play);
	}
}
