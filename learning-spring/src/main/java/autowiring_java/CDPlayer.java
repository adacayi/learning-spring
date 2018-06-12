package autowiring_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	static String play = "CD Player started playing\n";

	public CDPlayer() {
		System.out.println("Parameterless constructor");
	}

	@Autowired
	public CDPlayer(CompactDisc cd) {
		System.out.println(
				"Constructor with one parameter started. Parameterless constructor will not be called since this constructor is annotated with Autowired.");
		this.cd = cd;
	}

	// If we wrote another constructor with @Autowired, as the code below, we would
	// get a runtime error.

	// @Autowired
	// public CDPlayer(CompactDisc cd, CompactDisc disc2) {
	// System.out.println(
	// "Constructor with 2 parameters started. Parameterless constructor will not be
	// called since this constructor is annotated with Autowired.");
	// this.cd = cd;
	// }

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
