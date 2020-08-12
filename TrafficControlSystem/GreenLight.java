package com.company;

public class GreenLight implements Reciever {

    @Override
    public void on() {
        System.out.println("Switching on green light");
    }

    @Override
    public void off() {
        System.out.println("Switching off green light");
    }
}
