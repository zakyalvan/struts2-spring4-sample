package com.innovez.sample.core;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @author zakyalvan
 */
@Configuration
@ComponentScan
@EnableSpringConfigured
@EnableAspectJAutoProxy
@PropertySources({
        @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = false),
        @PropertySource(value = "${user.home}/.innovez/application.properties", ignoreResourceNotFound = true)
})
public class CoreConfig {
    /**
     * Enable property placeholder.
     *
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    /**
     * Enable method validation, this enable by new features in bean validation specs.
     *
     * @return
     */
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        MethodValidationPostProcessor postProcessor = new MethodValidationPostProcessor();
        return postProcessor;
    }
}
