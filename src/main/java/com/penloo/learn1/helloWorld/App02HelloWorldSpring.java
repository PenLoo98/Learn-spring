package com.penloo.learn1.helloWorld;


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
        System.out.println("bean person1: "+context.getBean("person"));
        System.out.println("bean person2: "+context.getBean("person2_MethodCall"));
        System.out.println("bean person3: "+context.getBean("person3_Parameters"));
        System.out.println("bean person4: "+context.getBean("person4_Primary"));
        System.out.println("bean person5: "+context.getBean("person5_Qualifier"));
        System.out.println(context.getBean(Address.class));

        // Spring이 관리하는 bean 객체의 이름을 모두 출력 - 함수형
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
