package com.penloo.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// record: Bean 객체 생성을 위한 클래스를 간단하게 만들어주는 기능
record Person(String name, int age, Address address){};
record Address(String city, String street){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){return "Penloo";}
    @Bean
    public int age(){return 20;}
    @Bean
    public Person person(){
        return new Person("Github", 15, new Address("LA", "Hollywood"));
    }
    // @Bean 메서드를 호출해서 사용할 수 있다.
    @Bean
    public Person person2_MethodCall(){
        return new Person(name(), age(), address());
    }
    // @Bean 메서드의 파라미터로 다른 빈 객체를 사용할 수 있다.
    @Bean
    public Person person3_Parameters(String name, int age, Address address2){
        return new Person(name, age, address2);
    }
    // @Bean 이름 지정가능
    @Bean(name = "address")
    public Address address(){
        return new Address("Seoul", "Gangnam");
    }
    @Bean
    public Address address2(){
        return new Address("London", "Baker Street");
    }
}
