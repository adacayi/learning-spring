package scope_prototype_java_proxymode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public void insertCd(CompactDisc cd) {
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
