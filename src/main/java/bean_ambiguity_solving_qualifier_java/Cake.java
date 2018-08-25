package bean_ambiguity_solving_qualifier_java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("soft")
public class Cake implements Dessert {

	@Override
	public void serve() {
		System.out.println("Serving cake");
	}

}
