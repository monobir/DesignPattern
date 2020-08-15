package com.company;

import java.io.Serializable;

/**
 * We often need to serialize/deserialize objects in Java.
 * Any class that needs to be serialized/deserialized must implement the serializable interface.
 * Note that, the de-serialization step always creates a new instance of the class,
 * which destroys the singleton pattern. Here is an example -
 */


public class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 8806820726158932906L;
    private static SerializableSingleton instance;
    private SerializableSingleton() {}
    public static synchronized SerializableSingleton getInstance(){
        if (instance == null){
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
     * Change for resolve de-serialization Issue. (Uncomment below code)
     * implement readResolve method to return the existing instance
     */

    //    protected Object readResolve() {
    //        return instance;
    //    }
}
