package profile_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.default", "prod");
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("profile_xml/config.xml")) {
			Greeter greeter = context.getBean(Greeter.class);
			System.out.println(greeter.greet());
		}
	}

}
