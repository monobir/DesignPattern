package com.company;

public class Normal implements SoundState{
    private MobileAlertManager normalState;

    public Normal(MobileAlertManager state) {
        this.normalState = state;
    }

    @Override
    public void alert() {
        System.out.println("Normal...");
    }


}
