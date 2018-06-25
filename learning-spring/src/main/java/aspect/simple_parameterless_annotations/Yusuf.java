package aspect.simple_parameterless_annotations;

import org.springframework.stereotype.Component;

@Component
public class Yusuf implements Performance {

	@Override
	public void perform() {
		System.out.println("Daglar ile taslar ile");
		System.out.println("Cagirayim Mevlam seni");
		System.out.println("Seherlerde kuslar ile");
		System.out.println("Cagirayim Mevlam seni");
	}

}
