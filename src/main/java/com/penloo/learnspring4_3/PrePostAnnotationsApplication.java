package com.penloo.learnspring4_3;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }

    // 의존성을 연결하는 대로 초기화를 실행하는 어노테이션: @PostConstruct
    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    // 컨테이너에서 인스턴스를 삭제하는 과정 중일 때 알림을 받는 어노테이션: @PreDestroy
    @PreDestroy
    public void cleanUp(){
        System.out.println("All dependencies are destroyed");
    }
}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Some logic using SomeDependency");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationsApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
        catch (Exception exception){
        }
    }
}