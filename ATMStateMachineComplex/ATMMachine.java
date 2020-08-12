package com.company;

public class ATMMachine {
    // States of the machine
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    // State that will change its state or switch between above states.

    ATMState state;
    private int cashInMachine = 20000;
    private boolean correctPin = false;
    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);
        this.state = noCard;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void setCorrectPin(boolean correctPin) {
        this.correctPin = correctPin;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void insert(){
        state.insertCard();
    }
    public void eject(){
        state.ejectCard();
    }
    public void enterPin(int enteredPin){
        state.insertPin(enteredPin);
    }
    public void withdraw(int amount){
        state.requestCash(amount);
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public ATMState getAtmOutOfMoney() {
        return atmOutOfMoney;
    }
}
