package com.company;

// Need to implement this on Concrete class of finite states of the state machine
public interface ATMState {
    void insertCard();
    void ejectCard();
    void withdrawMoney();
}
