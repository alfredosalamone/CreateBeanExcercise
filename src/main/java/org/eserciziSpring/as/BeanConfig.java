package org.eserciziSpring.as;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean(name = "student1")
    public Student getStudent() {
        return new Student("pinco", "pallino");
    }
}
