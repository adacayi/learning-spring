package conditional_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CasterConfig {

	@Bean
	@Conditional(MagicExistsCondition.class)
	public Caster spellCaster() {
		return new SpellCaster();
	}
}
