package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class WireBeanConfig {

    /*
    * This approach is usually the best choice because it doesn't depend on the CompactDisc bean being declared
    * in the same configuration file. We use @Import to import other configuration file that contains CompactDisc bean
    * or use @ComponentScan
    * */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
