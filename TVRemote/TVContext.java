package com.company;

public class TVContext {

    TVState start;
    TVState stop;
    TVState state;

    public TVContext() {
        this.start = new StartState(this);
        this.stop = new StopState(this);
        this.state = stop;
    }

    public void setState(TVState state) {
        this.state = state;
    }
    public void requestAction(){
        state.doAction();
    }

    public TVState getStart() {
        return start;
    }

    public TVState getStop() {
        return stop;
    }

    public TVState getState() {
        return state;
    }
}
