package com.penloo.learnspring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class App05RealWorldSpringLayer {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App05RealWorldSpringLayer.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
