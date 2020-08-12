package com.company;

public interface ATMState {
    // Different states expected
    // HasCard, NoCard, HasPin, NoCash

    void insertCard();
    void ejectCard();
    void insertPin(int pin);
    void requestCash(int cashToWithdraw);

}
