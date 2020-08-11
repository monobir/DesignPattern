package com.company;

public class Main {

    public static void main(String[] args) {
        NetworkEventHandler handler = new NetworkEventHandler();
        handler.addObserver(new DisplayModule("Display Module"));
        handler.addObserver(new CoffeeDispenser("Coffee Dispenser"));
        handler.addObserver(new CardDispenser("Card Dispenser"));
        handler.networkDisconnected();
    }
}
