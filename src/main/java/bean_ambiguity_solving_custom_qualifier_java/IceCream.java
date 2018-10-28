package bean_ambiguity_solving_custom_qualifier_java;

import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {

	@Override
	public void serve() {
		System.out.println("Serving ice cream");
	}

}
