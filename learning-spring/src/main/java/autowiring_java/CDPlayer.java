package autowiring_java;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		System.out.println("CD Player started playing");
		cd.play();
	}
}
