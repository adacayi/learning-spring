package scope_prototype_xml_proxymode;

import org.springframework.beans.factory.annotation.Autowired;

public class CdPlayer implements MediaPlayer {

	private CompactDisc compactDisc;

	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.compactDisc = cd;
	}

	@Override
	public void play() {
		if (compactDisc == null)
			System.out.println("No cd inserted");
		else
			compactDisc.play();
	}

}
