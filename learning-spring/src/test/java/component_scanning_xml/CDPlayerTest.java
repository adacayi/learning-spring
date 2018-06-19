package component_scanning_xml;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("CDPlayerConfig.xml") // Note that package path is not given here.
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		Assertions.assertNotNull(cd);
	}
}