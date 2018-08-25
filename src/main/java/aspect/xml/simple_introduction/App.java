package aspect.xml.simple_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"aspect/xml/simple_introduction/config.xml")) {
			Performance performance = context.getBean(Performance.class);
			performance.perform();
			((Travel) performance).travel();
		}
	}
}
