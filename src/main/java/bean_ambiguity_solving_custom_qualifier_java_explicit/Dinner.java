package bean_ambiguity_solving_custom_qualifier_java_explicit;

public class Dinner implements Meal {

	private Dessert dessert;

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
