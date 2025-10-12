package org.java_fundamentals._07_OOP._07_interface._05_polymorphismInterface;

public class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("Playing piano.");
    }
}
