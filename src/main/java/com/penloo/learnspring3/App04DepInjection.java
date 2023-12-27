package com.penloo.learnspring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Bussiness Class
@Component
class YourBusinessClass{
    // 자동으로 의존성을 주입하도록 한다.
    Dependency1 dependency1;
    Dependency2 dependency2;

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection : dependency 1 and 2");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection - setDependency1");
        this.dependency1 = dependency1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - setDependency2");
        this.dependency2 = dependency2;
    }

    public Dependency1 getDependency1() {
        return dependency1;
    }
    public Dependency2 getDependency2() {
        return dependency2;
    }
    public String toString(){
        return "using "+dependency1+" and "+dependency2;
    }
}
@Component
class Dependency1{}
@Component
class Dependency2{}


@Configuration
@ComponentScan
public class App04DepInjection {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App04DepInjection.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
