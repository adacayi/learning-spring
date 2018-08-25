package aspect.simple_parameterless_aspect_changing_bean_type;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CdPlayer {

	@Pointcut("execution( * aspect.simple_parameterless_aspect_changing_bean_type.CompactDisc.play())")
	public void play() {

	}

	@Around("play()")
	public void rounder(ProceedingJoinPoint jp) {
		System.out.println("Play will start");
		try {
			jp.proceed();
		} catch (Throwable e) {
			System.out.println("Unable to play");
			e.printStackTrace();
		}
		System.out.println("Played");
	}
}
