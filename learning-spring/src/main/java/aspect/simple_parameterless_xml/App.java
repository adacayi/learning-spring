package aspect.simple_parameterless_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"aspect/simple_parameterless_xml/config.xml")) {
			Performance performance = context.getBean(Performance.class);
			performance.perform();
		}
	}
}
