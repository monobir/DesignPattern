package com.company;

public class NoCardState implements ATMState{

    private ATMStateMachine stateMachine;

    public NoCardState(ATMStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted");
        stateMachine.changeState(stateMachine.getHasCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("No card detected");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("No card detected to withdraw money");
    }
}
