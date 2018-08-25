package joining_configuration_xml;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	static String play = "CD Player started playing\n";

	public CDPlayer(CompactDisc cd) {
		System.out.println("Constructor with one parameter started.");
		this.cd = cd;
	}

	public void setCD(CompactDisc cd) {
		System.out.println("Setting up without autowiring");
		this.cd = cd;
	}

	@Autowired
	public void setCDWithWired(CompactDisc cd) {
		System.out.println("setCDWithWired");
		this.cd = cd;
	}

	/*
	 * This method is to show multiple autowiring in action. There are
	 * two @Autowired methods and they will be executed arbitrarily.
	 */
	@Autowired
	public void multipleAutowiring(CompactDisc cd) {
		System.out.println("multipleAutowiring");
	}

	public void play() {
		System.out.print(play);
		cd.play();
	}
}
