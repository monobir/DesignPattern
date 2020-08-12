package com.company;

public class MobileAlertManager {
    SoundState normal;
    SoundState vibration;
    SoundState silent;

    SoundState currentState;

    public MobileAlertManager() {
        this.normal = new Normal(this);
        this.vibration = new Vibration(this);
        this.silent = new Silent(this);

        // Initial state is normal.
        this.currentState = normal;
    }

    public void viewCurrentProfile(){
        currentState.alert();
    }

    public void changeSoundProfile(SoundState state){
        this.currentState = state;
    }

    public SoundState getNormal() {
        return normal;
    }

    public SoundState getVibration() {
        return vibration;
    }

    public SoundState getSilent() {
        return silent;
    }
}
