package aspect.simple_parameterless_aspect_changing_bean_type;

import org.springframework.stereotype.Component;

@Component
public class Yunus implements CompactDisc {

	private String name = "Yunus - Daglar ile";

	@Override
	public void play() {
		System.out.println(name);
	}

}
