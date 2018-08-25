package aspect.xml.simple_parameterless_around;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void watchPerformance(ProceedingJoinPoint jp) {
		System.out.println("Silence your mobile phones");
		System.out.println("Take your seats\n");
		try {
			jp.proceed();
			System.out.println("\nShow is over");
			System.out.println("\nApplauses..");
		} catch (Exception e) {
			System.out.println("\nShow is over");
			System.out.println("\nRefund the tickets");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
