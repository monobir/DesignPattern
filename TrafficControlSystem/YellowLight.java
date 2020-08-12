package com.company;

public class YellowLight implements Reciever {

    @Override
    public void on() {
        System.out.println("Switching on yellow light");
    }

    @Override
    public void off() {
        System.out.println("Switching off yellow light");
    }
}
