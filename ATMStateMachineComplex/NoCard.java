package com.company;

public class NoCard implements ATMState {

    private ATMMachine stateMachine;

    public NoCard(ATMMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted");
        stateMachine.setState(stateMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card detected.Can't Eject");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("No card detected.Can't insert pin");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("No card detected.Can't withdraw money");
    }
}
