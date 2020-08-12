package com.company;

public class Vibration implements SoundState{
    private MobileAlertManager vibrationState;

    public Vibration(MobileAlertManager state) {
        this.vibrationState = state;
    }

    @Override
    public void alert() {
        System.out.println("Vibration...");
    }
}
