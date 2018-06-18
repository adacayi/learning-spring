package joining_configuration_java;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CompactDiscConfig.class)
@ImportResource("joining_configuration_java/mediaPlayerConfig.xml")
public class SpringConfiguration {
}
