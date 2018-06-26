package aspect.simple_parameterless_annotations_xml;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* aspect.simple_parameterless_annotations_xml.Performance.perform(..))")
	public void perform() {

	}

	@Before("perform()")
	public void silenceMobilePhones() {
		System.out.println("Silence your mobile phones");
	}

	@Before("perform()")
	public void takeSeats() {
		System.out.println("Take your seats\n");
	}

	@After("perform()")
	public void showIsOver() {
		System.out.println("\nShow is over");
	}

	@AfterReturning("perform()")
	public void applaud() {
		System.out.println("\nApplauses..");
	}

	@AfterThrowing("perform()")
	public void refund() {
		System.out.println("\nRefund the tickets");
	}
}
