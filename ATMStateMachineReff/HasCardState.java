package com.company;

public class HasCardState implements ATMState{
    private ATMStateMachine stateMachine;

    public HasCardState(ATMStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("Can't insert more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        stateMachine.changeState(stateMachine.getNoCardState());
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Money withdrawn");
    }
}
