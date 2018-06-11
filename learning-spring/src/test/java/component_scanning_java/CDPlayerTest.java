package component_scanning_java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import component_scanning_java.CDPlayerConfig;
import component_scanning_java.CompactDisc;

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