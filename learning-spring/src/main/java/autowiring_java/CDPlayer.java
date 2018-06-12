package autowiring_java;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	static String play = "CD Player started playing\n";

	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		System.out.print(play);
		cd.play();
	}
}
