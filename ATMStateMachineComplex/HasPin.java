package com.company;

public class HasPin implements ATMState {

    private ATMMachine stateMachine;

    public HasPin(ATMMachine stateMachine) {
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
        if (cashToWithdraw < stateMachine.getCashInMachine()){
            System.out.println("Cash withdrawn of amount : " + cashToWithdraw);
            stateMachine.setCashInMachine(stateMachine.getCashInMachine() - cashToWithdraw);
            if (stateMachine.getCashInMachine() <= 0){
                stateMachine.setState(stateMachine.getAtmOutOfMoney());
            }
        }else{
            System.out.println("Your requested cash not available in the machine");
            System.out.println("Card Ejected");
            stateMachine.setState(stateMachine.getNoCard());
        }
    }
}
