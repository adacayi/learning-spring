package aspect.simple_introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
//If we add @ComponentScan, this won't help. This has to be defined as bean explicitly in java configuration.
public class TravellerIntroducer {

	@DeclareParents(value = "aspect.simple_introduction.Performance+", defaultImpl = Traveller.class)
	public static Travel travel;// Travel has to be an interface. If we put Traveller instead, it would give a
								// runtime error when generating the bean
}
