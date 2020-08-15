package com.company;

/**
 * To protect your singleton class against instantiation via reflection,
 * you can throw an exception from the private constructor if the instance is already created like this
 */
public class MySingletonWithReflectionProtection {
    private static final MySingletonWithReflectionProtection instance = new MySingletonWithReflectionProtection();

    private MySingletonWithReflectionProtection(){
        // protect against instantiation via reflection
        if (instance != null){
            throw new IllegalStateException(" Singleton instance already exists");
        }
    }

    public static MySingletonWithReflectionProtection getInstance(){
        return instance;
    }

    /**
     * You can also use an Enum singleton to guard against reflection. Enums can’t be initialized via reflection.
     * They are a sure shot way of having a single instance no matter what.
     */
}
