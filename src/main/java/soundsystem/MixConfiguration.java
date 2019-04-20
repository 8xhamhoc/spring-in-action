package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(RootConfig.class)
@ImportResource("classpath:knight.xml")
public class MixConfiguration {
}
