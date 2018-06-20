package bean_ambiguity_solving_customqualifier_java;

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
