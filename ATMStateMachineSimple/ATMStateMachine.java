package com.company;

public class ATMStateMachine {
    private ATMState state;

    public ATMStateMachine() {
        this.state = new NoCardState();
    }

    public ATMState getState() {
        return state;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public void insert(){
        state.insertCard();
        // Now state has to be changed to HasCardState

        // This is the manual process. we shouldn't use this way.
        // On the next same example we will use Reference passing method
        if(state instanceof NoCardState){
            ATMState newState = new HasCardState();
            setState(newState);
            System.out.println("State changed to : "+state.getClass().getSimpleName());
        }
    }
    public void eject(){
        state.ejectCard();
        // Now state has to be changed to NoCardState


        // This is the manual process. we shouldn't use this way.
        // On the next same example we will use Reference passing method  
        if (state instanceof HasCardState){
            ATMState newState = new NoCardState();
            setState(newState);
            System.out.println("State changed to : " + state.getClass().getSimpleName());
        }
    }
    public void withdraw(){
        state.withdrawMoney();
    }
}
