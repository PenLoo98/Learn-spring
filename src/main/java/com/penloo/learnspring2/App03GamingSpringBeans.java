package com.penloo.learnspring2;

import com.penloo.learnspring2.game.GameRunner;
import com.penloo.learnspring2.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.penloo.learnspring2.game")
public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
            // Bean이름, 클래스명으로 빈을 선택한다.
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
