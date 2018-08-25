package component_scanning_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("component_scanning_xml/CDPlayerConfig.xml")) {
			CompactDisc disc = context.getBean(CompactDisc.class);
			disc.play();
		}
	}
}
