package com.company;

public class HasCard implements ATMState {

    private ATMMachine stateMachine;

    public HasCard(ATMMachine stateMachine) {
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
        if (pin == 1234){
            System.out.println("You have entered correct pin");
            stateMachine.setCorrectPin(true);
            stateMachine.setState(stateMachine.getHasCorrectPin());
        }else{
            System.out.println("You have entered wrong pin");
            stateMachine.setCorrectPin(false);
            // Staying on the same state (HasCard state)
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You haven't entered your card pin");
    }
}
