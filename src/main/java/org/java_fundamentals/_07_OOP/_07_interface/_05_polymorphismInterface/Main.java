package org.java_fundamentals._07_OOP._07_interface._05_polymorphismInterface;

public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable piano = new Piano();

        football.play();
        piano.play();
    }
}
