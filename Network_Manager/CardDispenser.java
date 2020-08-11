package com.company;

public class CardDispenser implements Observer {
    private String name;

    public CardDispenser(String name) {
        this.name = name;
    }

    @Override
    public void notifyObserver() {
        System.out.println(name + " Notified");
    }
}
