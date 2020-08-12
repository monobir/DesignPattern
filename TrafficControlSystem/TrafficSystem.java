package com.company;

public class TrafficSystem {
    private State greenState;
    private State redState;
    private State yellowState;
    private State currentState;
    private State previousState;

    public TrafficSystem() {
        this.greenState = new Green(this,new GreenLight());
        this.redState = new Red(this,new RedLight());
        this.yellowState = new Yellow(this, new YellowLight());
        Reciever initial = new GreenLight();
        this.currentState = new Green(this,initial);
        this.previousState = new Green(this,initial);
    }

    public State getGreenState() {
        return greenState;
    }

    public void setGreenState(State greenState) {
        this.greenState = greenState;
    }

    public State getRedState() {
        return redState;
    }

    public void setRedState(State redState) {
        this.redState = redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public void setYellowState(State yellowState) {
        this.yellowState = yellowState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }

    public void change(){
        getCurrentState().changeState();
    }
    public void display(){
        getCurrentState().displayState();
    }
}
