package com.company;

public class RedLight implements Reciever {

    @Override
    public void on() {
        System.out.println("Switching on red light");
    }

    @Override
    public void off() {
        System.out.println("Switching off red light");
    }
}
