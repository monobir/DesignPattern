package com.company;

public class Silent implements SoundState {
    private MobileAlertManager silentState;

    public Silent(MobileAlertManager silentState) {
        this.silentState = silentState;
    }

    @Override
    public void alert() {
        System.out.println("Silent...");
    }
}
