package explicit_configuration_xml;

public class CDPlayerWithPropertyInjection implements MediaPlayer {
	private CompactDisc cd;
	static String play = "CD Player started playing\n";

	public void setCd(CompactDisc cd) {
		System.out.println("Setting up without autowiring");
		this.cd = cd;
	}

	public void play() {
		System.out.print(play);
		cd.play();
	}
}
