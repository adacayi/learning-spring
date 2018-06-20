package bean_ambiguity_solving_qualifier_java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cold")
public class IceCream implements Dessert {

	@Override
	public void serve() {
		System.out.println("Serving ice cream");
	}

}
