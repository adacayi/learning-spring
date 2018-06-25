package aspect.simple_introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class TravellerIntroducer {

	@DeclareParents(value = "aspect.simple_introduction.Performance+", defaultImpl = Traveller.class)
	public static Travel travel;
}
