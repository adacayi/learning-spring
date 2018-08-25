package explicit_configuration_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"explicit_configuration_xml/config.xml")) { // Notice that auto wiring does not work. It works when
															// component scan is defined in XML configuration
			MediaPlayer player = (MediaPlayer) context.getBean("cdPlayer");
			player.play();
			// To show c-namespace functionality in XML configuration
			MediaPlayer secondPlayer = (MediaPlayer) context.getBean("mediaPlayerWithc-namespace");
			secondPlayer.play();
			CompactDisc multi = (CompactDisc) context.getBean("cdMulti"); // To show list wiring with constructor-arg.
			multi.play();
			CompactDisc multiWithUtil = (CompactDisc) context.getBean("cdMultiWithUtil"); // To show list wiring with constructor-arg.
			multiWithUtil.play();
			MediaPlayer playerWithProperty = (MediaPlayer) context.getBean("cdPlayerWithProperty"); // To show property injection
			playerWithProperty.play();
		}
	}
}
