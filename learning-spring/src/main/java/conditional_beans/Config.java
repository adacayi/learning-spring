package conditional_beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ MagicConfig.class, CasterConfig.class }) // Order here is important
public class Config {

}
