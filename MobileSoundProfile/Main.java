package com.company;

public class Main {

    public static void main(String[] args) {
        MobileAlertManager mobile = new MobileAlertManager();
        mobile.viewCurrentProfile();
        mobile.viewCurrentProfile();
        mobile.changeSoundProfile(mobile.getSilent());
        mobile.viewCurrentProfile();
        mobile.changeSoundProfile(mobile.getVibration());
        mobile.viewCurrentProfile();
        mobile.viewCurrentProfile();
        mobile.changeSoundProfile(mobile.getNormal());
        mobile.viewCurrentProfile();
        mobile.viewCurrentProfile();
    }
}
