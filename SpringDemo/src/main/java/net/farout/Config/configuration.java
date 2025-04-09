package net.farout.Config;

import net.farout.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {

    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}
