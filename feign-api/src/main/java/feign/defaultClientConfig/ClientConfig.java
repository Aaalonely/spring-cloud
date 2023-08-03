package feign.defaultClientConfig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {
    @Bean
    public Logger.Level loggerLevel() {
        return Logger.Level.BASIC;
    }
}
