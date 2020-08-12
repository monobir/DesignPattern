package com.company;

import java.util.ArrayList;
import java.util.List;

public class TechGroup implements SubscribeManager{
    private String groupName;
    private List<Observer> groupMembers = new ArrayList<Observer>();

    public TechGroup(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void subscribeToGroup(Observer obj) {
        groupMembers.add(obj);
        System.out.println(obj.getGroupName() + " Subscribed to " + this.groupName);
        System.out.println("\t\t You will get notified from this group post");
    }

    @Override
    public void unSubscribeFromGroup(Observer obj) {
        for(int i =0; i<groupMembers.size();i++){
            Observer group = groupMembers.get(i);
            if (group.getGroupName().equals(obj.getGroupName())){
                groupMembers.remove(group);
                System.out.println(obj.getGroupName() + " Unsubscribed from " + this.groupName);
                System.out.println("\t\t You won't get any farther notification from this group post");
            }
        }
    }

    @Override
    public void notifyToAllUser(String msg) {
        for (Observer group: groupMembers) {
            group.notifyToUsers(msg);
        }
    }

    @Override
    public void createNewPost(String postMessage) {
        String postDetails = "New Post Created:\n\t\t Post Details: "+ postMessage;
        this.notifyToAllUser(postDetails);
    }
}
