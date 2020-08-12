package com.company;

public class NoCardState implements ATMState{


    @Override
    public void insertCard() {
        System.out.println("*** Card Inserted ***");
    }

    @Override
    public void ejectCard() {
        System.out.println("Can't Eject. No card Detected");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Can't withdraw money. No card detected");
    }
}
