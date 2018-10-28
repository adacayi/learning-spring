package autowiring_xml;

public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	static String play = "CD Player started playing\n";

	public CDPlayer() {
		System.out.println("Parameterless constructor");
	}

	public CDPlayer(CompactDisc cd) {
		System.out.println(
				"Constructor with one parameter started.");
		this.cd = cd;
	}

	public void setCd(CompactDisc cd) {
		System.out.println("Setting up with autowiring");
		this.cd = cd;
	}

	public void play() {
		System.out.print(play);
		cd.play();
	}
}
