package com.company;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton obj2 = EagerInitializedSingleton.getInstance();
        System.out.println("obj1 hash code: " + obj1.hashCode());
        System.out.println("obj2 hash code: " + obj2.hashCode());

        /**
         * Now Testing the singleton thread problem with multiple thread.
         */

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
                System.out.println("Instance1 hash code: " + instance1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
                System.out.println("Instance2 hash code: " + instance2.hashCode());
            }
        });

        /**
         * If we run this code most of the time the hash code will not same means two thread will create
         * Different object you can test it with multiple times or start the t1 and t2 inside the loop.
         * Hash code of two instance will not same most of the time.
         */

        /**
         * Starting the Thread
         */
        t1.start();
        t2.start();

        /**
         * Now testing with ThreadSafeSingleton
         */

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSafeSingleton insta1 = ThreadSafeSingleton.getInstanceOptimized();
                System.out.println("Insta1 hash code: " + insta1.hashCode());
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSafeSingleton insta2 = ThreadSafeSingleton.getInstance();
                System.out.println("Insta1 hash code: " + insta2.hashCode());
            }
        });

        /**
         * This time object should not have different hash code.
         * Means solved the Write issue of object at same time.
         */
        t3.start();
        t4.start();


        /**
         * Singleton and Reflection
         * Java’s Reflection API is very powerful.
         * You can use Reflection to instantiate a class even if the class’s constructor is private.
         */

        EagerInitializedSingleton singletonInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton reflectionInstance = null;

        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor:constructors) {
                constructor.setAccessible(true);
                reflectionInstance = (EagerInitializedSingleton) constructor.newInstance();
            }

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        /**
         * Always give the different hash code because new object is instantiated.
         */
        System.out.println("SingletonInstance hash code: " + singletonInstance.hashCode());
        System.out.println("ReflectionInstance hash code: " + reflectionInstance.hashCode());


        /**
         * Notice one thing how we created a new instance of the Singleton using constructor.newInstance().
         * This destroys the singleton pattern concept and user can create another (Multiple object) of Singleton
         * So we have to protect from reflection Instantiation. One way is to throw an exception from constructor
         * See MySingletonWithReflectionProtection
         */

        /**
         * Testing of SerializableSingleton
         */

        SerializableSingleton serializeInstance = SerializableSingleton.getInstance();

        try{
            // Serialize singleton object to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(serializeInstance);
            out.close();

            // deserialize singleton object from the file

            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            SerializableSingleton serializeInstanceIn = (SerializableSingleton) in.readObject();
            in.close();

            System.out.println("serializeInstance hash code : " + serializeInstance.hashCode());
            System.out.println("serializeInstanceIn hash code: " + serializeInstanceIn.hashCode());

        }catch (IOException ex){
            throw new IOException(ex);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        /**
         * Notice how the hashCodes of the original instance and the de-serialized instance are different.
         * There are clearly two instances of our singleton class.
         * Protection against Serialization
         * To prevent the de-serialization process from creating a new instance,
         * you can implement the readResolve() method in the singleton class.
         * It is invoked when the object is de-serialized.
         * See change on the SerializableSingleton class---- and Un-comment the Commented code.
         */
    }
}
