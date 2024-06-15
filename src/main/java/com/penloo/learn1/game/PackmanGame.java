package com.penloo.learn1.game;

public class PackmanGame implements GamingConsole{

        public void up(){
            System.out.println("North");
        }

        public void down(){
            System.out.println("South");
        }

        public void left(){
            System.out.println("West");
        }

        public void right(){
            System.out.println("East");
        }
}
