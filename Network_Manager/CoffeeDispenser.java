package com.company;

public class CoffeeDispenser implements Observer{
    private String name;

    public CoffeeDispenser(String name) {
        this.name = name;
    }

    @Override
    public void notifyObserver() {
        System.out.println(name + " Notified");
    }
}
