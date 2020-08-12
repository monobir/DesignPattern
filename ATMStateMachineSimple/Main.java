package com.company;

public class Main {

    public static void main(String[] args) {
	    ATMStateMachine machine = new ATMStateMachine();
	    machine.eject();
	    machine.withdraw();
	    machine.insert();
        machine.withdraw();
	    machine.eject();
    }
}
