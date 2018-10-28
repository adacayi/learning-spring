package aspect.simple_parameter_multi_around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Audience {
    @Around("execution(* aspect.simple_parameter_multi_around.Performance.perform(..)) && args(name,times)")
    public void watchPerformance(ProceedingJoinPoint jp, String name, int times) {
        System.out.println("Silence your mobile phones");
        System.out.println("Take your seats\n");
        System.out.printf("%s is coming to perform %d times\n\n", name, times);
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
