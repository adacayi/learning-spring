package com.sanver.learning.learning_spring.autowiringjava;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		Assertions.assertNotNull(cd);
	}
}