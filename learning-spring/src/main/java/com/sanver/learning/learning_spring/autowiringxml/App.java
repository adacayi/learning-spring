package com.sanver.learning.learning_spring.autowiringxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sanver/learning/learning_spring/autowiringxml/CDPlayerConfig.xml")) {
			CompactDisc disc = context.getBean(CompactDisc.class);
			disc.play();
		}
	}
}
