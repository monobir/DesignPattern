package com.company;

public class HasCardState implements ATMState {


    @Override
    public void insertCard() {
        System.out.println("Can't Take more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("*** Card Ejected ***");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Pin is correct and Money has been withdrawn");
    }
}
