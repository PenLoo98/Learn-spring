package com.penloo.learn1.game;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var packmanGame = new PackmanGame();

        var gameRunner1 = new GameRunner(marioGame); // Wiring Dependency
        gameRunner1.run();
        var gameRunner2 = new GameRunner(superContraGame);
        gameRunner2.run();
        var gameRunner3 = new GameRunner(packmanGame);
        gameRunner3.run();
    }
}
