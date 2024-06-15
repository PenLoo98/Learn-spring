package com.penloo.learn1.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration{
    @Bean
    public GamingConsole game(){
        var game = new PackmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var runner = new GameRunner(game);
        return runner;
    }

    @Bean
    public GamingConsole marioGame(){
        return new MarioGame();
    }

    @Bean
    public GameRunner marioJump(GamingConsole marioGame){
        return new GameRunner(marioGame);
    }
}
