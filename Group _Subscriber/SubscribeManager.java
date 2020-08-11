package com.company;

public interface SubscribeManager {
    void subscribeToGroup(Observer obj);
    void unSubscribeFromGroup(Observer obj);
    void notifyToAllUser(String msg);
    void createNewPost(String postMessage);
}
