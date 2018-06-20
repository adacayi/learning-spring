package scope_prototype_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CdPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public void insertCd(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		if (cd == null)
			System.out.println("No cd inserted");
		else
			cd.play();
	}

}
