package com.company;

public class DisplayModule implements Observer{
    private String name;

    public DisplayModule(String name) {
        this.name = name;
    }

    @Override
    public void notifyObserver() {
        System.out.println(name + " Notified");
    }
}
