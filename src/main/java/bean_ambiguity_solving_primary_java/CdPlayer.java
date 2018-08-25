package bean_ambiguity_solving_primary_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
