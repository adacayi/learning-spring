package com.sanver.learning.learning_spring.autowiringjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				CDPlayerConfig.class)) {
			CompactDisc disc = context.getBean(CompactDisc.class);
			disc.play();
		}
	}
}
