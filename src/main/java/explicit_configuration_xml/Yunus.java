package explicit_configuration_xml;

public class Yunus implements CompactDisc {
	private static String artist = "Yunus";
	private static String title = "Daglar ile";
	private static String name = artist + " - " + title;
	public static String play = String.format("Playing %s\n", name);

	public Yunus() {
		System.out.printf("%s constructor called\n", name); // This is to show that only one instance of Yunus is
															// generated during context initialization.
	}

	public void play() {
		System.out.print(play);
	}
}
