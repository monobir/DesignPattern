package com.company;

public class StaticBlockSingleton {
    /**
    Static Block initialization implementation is similar to eager initialization.
    Except that instance of class is created in the static block that provides option for exception handling.
    Both eager initialization and static block initialization creates the instance even before it’s being used
    and that is not the best practice to use. So in further sections.
    we will learn how to create a Singleton class that supports lazy initialization.
     */

    private static StaticBlockSingleton instance;

    // Private constructor to protect another instance creation from user end.
    private StaticBlockSingleton(){};

    //static block initialization for exception handling
    static {
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occurs when creating new singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

}
