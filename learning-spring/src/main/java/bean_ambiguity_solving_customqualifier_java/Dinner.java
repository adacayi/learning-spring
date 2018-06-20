package bean_ambiguity_solving_customqualifier_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dinner implements Meal {

	private Dessert dessert;

	@Autowired
	@Cold
	@Fruity
	public void prepareDesert(Dessert dessert) {
		this.dessert = dessert;
	}

	@Override
	public void serve() {
		if (dessert == null)
			System.out.println("No dessert ready yet");
		else
			dessert.serve();
	}

}
