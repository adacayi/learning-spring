package bean_ambiguity_solving_primary_xml;

public class CdPlayer implements MediaPlayer {

	private CompactDisc cd;

	public void setCd(CompactDisc cd) {
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
