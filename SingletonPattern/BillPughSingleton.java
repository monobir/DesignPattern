package com.company;

public class BillPughSingleton {
    /** private constructor to prevent others from instantiating this class */
    private BillPughSingleton() {}
    /** This inner class is loaded only after getInstance() is called for the first time. */
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    /**
     Note that, the inner class is not loaded until the getInstance() method is invoked for the first time.
     This solution is thread-safe and does not require any synchronization. It is the most efficient approach
     among all the singleton design pattern implementations.
     */
}
