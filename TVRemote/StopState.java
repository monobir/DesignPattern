package com.company;

public class StopState implements TVState {
    TVContext tvContext;

    public StopState(TVContext tvContext) {
        this.tvContext = tvContext;
    }

    @Override
    public void doAction() {
        if (tvContext.getState() instanceof StopState){
            System.out.println("TV is turned ON");
            tvContext.setState(tvContext.getStart());
        }else{
            System.out.println("Do Nothing...");
        }

    }
}
