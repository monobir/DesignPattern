package com.company;

public class StartState implements TVState {
    TVContext tvContext;

    public StartState(TVContext tvContext) {
        this.tvContext = tvContext;
    }

    @Override
    public void doAction() {
        if (tvContext.getState() instanceof StartState){
            System.out.println("TV is turned OFF");
            tvContext.setState(tvContext.getStop());
        }else{
            System.out.println("Do Nothing...");
        }
    }
}
