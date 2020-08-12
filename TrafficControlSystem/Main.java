package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        TrafficSystem trafficSystem = new TrafficSystem();
        while (true) {
            trafficSystem.display();
            if (trafficSystem.getCurrentState() instanceof Yellow) {
                Thread.sleep(2000);
            } else {
                Thread.sleep(5000);
            }
            trafficSystem.change();
        }
    }
}
