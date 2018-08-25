package bean_ambiguity_solving_primary_java;

import org.springframework.stereotype.Component;

@Component
public class Yolcular implements CompactDisc {

	private String artist = "Yolcular";
	private String title = "Ilahiler 1";

	@Override
	public void play() {
		System.out.printf("Playing %s - %s\n", artist, title);
	}

}
