package com.company;

public class Main {

    public static void main(String[] args) {
	    ATMMachine dbbl = new ATMMachine();
	    dbbl.insert();
	    dbbl.enterPin(1234);
	    dbbl.withdraw(1000);
	    dbbl.eject();
	    dbbl.withdraw(100);
	    dbbl.insert();
	    dbbl.enterPin(12345); // Incorrect Pin
        dbbl.withdraw(100);
        dbbl.eject();

    }
}
