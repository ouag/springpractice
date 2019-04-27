package com.ouag.autoconf.samplefather;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FatherAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public IApplicationRunner getApplicationRunner() {
        return new FatherRunner();
    }
}
