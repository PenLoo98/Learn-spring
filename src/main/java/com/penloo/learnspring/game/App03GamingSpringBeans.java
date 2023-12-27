package com.penloo.learnspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);){
//            // getBean(클래스명) -> 하나의 클래스만 선택가능
//            context.getBean(GameRunner.class).run();

            // Bean이름, 클래스명으로 빈을 선택한다.
            context.getBean("marioJump", GameRunner.class).run();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
