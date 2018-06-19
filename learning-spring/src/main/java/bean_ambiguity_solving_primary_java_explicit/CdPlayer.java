package bean_ambiguity_solving_primary_java_explicit;

import org.springframework.beans.factory.annotation.Autowired;

public class CdPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		if (cd == null)
			System.out.println("No cd inserted");
		else
			cd.play();
	}

}
