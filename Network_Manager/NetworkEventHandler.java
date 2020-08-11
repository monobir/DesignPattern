package com.company;

import java.util.ArrayList;
import java.util.List;

public class NetworkEventHandler implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void addObserver(Observer obj) {
        this.observers.add(obj);
    }

    @Override
    public void networkDisconnected() {
        int i;
        for(i=0;i<observers.size();i++){
            Observer object = observers.get(i);
            object.notifyObserver();
        }
    }
}
