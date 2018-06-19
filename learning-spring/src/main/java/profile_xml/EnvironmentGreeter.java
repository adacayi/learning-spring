package profile_xml;

public class EnvironmentGreeter implements Greeter {

	private String environment;

	public EnvironmentGreeter(String environment) {
		this.environment = environment;
	}

	@Override
	public String greet() {
		return String.format("Welcome to %s\n", environment);
	}

}
