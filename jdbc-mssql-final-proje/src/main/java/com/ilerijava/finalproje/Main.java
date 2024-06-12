package com.ilerijava.finalproje;

public class Main {

	public static void main(String[] args) {
		
		CreateUser createUser = new CreateUser();
		createUser.insertUser("Ali Kılıç", 24);
		createUser.insertUser("Deneme Deneme",19);
		
		GetUser getUser = new GetUser();
		getUser.selectUsers();
		
		System.out.println("----------------------------");
		
		UpdateUser updateUserById = new UpdateUser();
		updateUserById.updateUser(2, "Cafer Dereboyu", 32);
		
		getUser.selectUsers();
		
		System.out.println("----------------------------");
		
		DeleteUser deleteUser = new DeleteUser();
		deleteUser.deleteUser("Ali Kılıç");
		
		getUser.selectUsers();
		
		System.out.println("----------------------------");
		
		
		

	}

}
