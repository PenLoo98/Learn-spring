package com.penloo.learn4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{}
@Component
@Lazy
class ClassB{
    private ClassA classA;

    // 즉시 초기화시 실행할 로직
    public ClassB(ClassA classA){
        System.out.println("Some initialization logic");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("doSomething");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Initialization of context is completed.");
            context.getBean(ClassB.class).doSomething();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}