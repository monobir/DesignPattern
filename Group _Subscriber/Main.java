package com.company;

public class Main {

    public static void main(String[] args) {
		System.out.println("====================================================================");
	    TechGroup itGroup = new TechGroup("bitBox");
	    UserOne user1 = new UserOne("user1");
	    UserTwo user2 = new UserTwo("user2");
	    UserThree user3 = new UserThree("user3");
	    itGroup.subscribeToGroup(user1);
	    itGroup.subscribeToGroup(user2);
	    itGroup.subscribeToGroup(user3);
		System.out.println("#####################################################################");
	    itGroup.createNewPost("This is First Post for this group");
		System.out.println("=====================================================================");
	    itGroup.createNewPost("This is Second Post for this group");
		System.out.println("=====================================================================");
	    itGroup.unSubscribeFromGroup(user2);
		System.out.println("*********************************************************************");
	    itGroup.createNewPost("This is 3rd Post for this group. User2 won't get this");
		System.out.println("=====================================================================");
    }
}
