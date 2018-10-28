package bean_ambiguity_solving_custom_qualifier_java;

import org.springframework.stereotype.Component;

@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

	@Override
	public void serve() {
		System.out.println("Serving popsicle");
	}

}
