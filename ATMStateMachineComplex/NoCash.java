package com.company;

public class NoCash implements ATMState {

    private ATMMachine stateMachine;
    public NoCash(ATMMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can only insert one card at a time");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        stateMachine.setState(stateMachine.getNoCard());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("No need to enter pin again");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("ATM out of Money");
        stateMachine.setState(stateMachine.getNoCard());
    }
}
