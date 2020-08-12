package com.company;

public class UserOne  implements Observer{
    private String name;
    public UserOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notifyToUsers(String post) {
        System.out.println(this.name + " : Notified");
        System.out.println(post);
    }

    @Override
    public String getGroupName() {
        return this.getName();
    }
}
