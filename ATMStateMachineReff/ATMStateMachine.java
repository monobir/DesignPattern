package com.company;

public class ATMStateMachine {
    private ATMState state;

    private ATMState hasCard = new HasCardState(this);
    private ATMState noCard = new NoCardState(this);

    public ATMStateMachine() {
        this.state = new NoCardState(this);
    }

    public ATMState getState() {
        return state;
    }

    public void setState(ATMState state) {
        this.state = state;
    }
    public ATMState getNoCardState(){
        return noCard;
    }
    public ATMState getHasCardState(){
        return hasCard;
    }

    public void changeState(ATMState newState){
        this.state = newState;
    }
    public void insert(){
        state.insertCard();
    }
    public void eject(){
        state.ejectCard();
    }
    public void withdraw(){
        state.withdrawMoney();
    }

}
