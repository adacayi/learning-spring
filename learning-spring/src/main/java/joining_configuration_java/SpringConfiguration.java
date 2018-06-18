package joining_configuration_java;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(MediaPlayerConfig.class)
@ImportResource("joining_configuration_java/CompactDiscConfig.xml")
public class SpringConfiguration {
}
