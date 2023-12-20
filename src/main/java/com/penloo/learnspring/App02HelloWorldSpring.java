package com.penloo.learnspring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 스프링 컨텍스트 실행하기
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 관리하는 빈 객체 출력하기 - @Bean이 붙은 메서드 이름으로 가져온다.
        // HelloWorldConfiguration - @Configuration
        // name() - @Bean
        System.out.println("bean name: "+context.getBean("name"));
        System.out.println("bean age: "+context.getBean("age"));
        System.out.println("bean person: "+context.getBean("person"));
        System.out.println("bean person: "+context.getBean("person2_MethodCall"));
        System.out.println("bean person: "+context.getBean("person3_Parameters"));
        System.out.println("bean person: "+context.getBean("address"));
    }
}
