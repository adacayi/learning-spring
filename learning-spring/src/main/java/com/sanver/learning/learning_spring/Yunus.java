package com.sanver.learning.learning_spring;

import org.springframework.stereotype.Component;

@Component
public class Yunus implements CompactDisc {
	private String artist = "Yunus";
	private String title = "Daglar ile";

	public void play() {
		System.out.printf("Playing %s - %s\n", artist, title);
	}
}
