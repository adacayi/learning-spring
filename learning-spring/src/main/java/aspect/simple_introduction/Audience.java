package aspect.simple_introduction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Audience {
	@Around("execution(* aspect.simple_introduction.Performance.perform(..))")
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
