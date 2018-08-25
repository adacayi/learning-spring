package spel_expressions_xml;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CdPlayer implements MediaPlayer {

	private CompactDisc cd;
	private LocalDateTime moment;
	private long millis;

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void setMillis(long millis) {
		this.millis = millis;
		Instant instant = Instant.ofEpochMilli(this.millis);
		moment = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	@Override
	public void play() {
		System.out.printf("Player powered at %s\n", moment.toString());
		if (cd == null)
			System.out.println("No disc inserted");
		else
			cd.play();
	}

}
