package org.eserciziSpring.as;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringBeansExample {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        for (String beanName : ctx.getBeanDefinitionNames()) {
            System.out.println("bean --->" + beanName);
        }
    }
}