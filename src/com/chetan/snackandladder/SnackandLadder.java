package com.chetan.snackandladder;

public class SnackandLadder {

	private int playerPosition = 0;
	
	public void showPosition()
	{
		System.out.println("Player Position = " + playerPosition );
	}
	
	public static void main(String[] args) {
		
		SnackandLadder snackandladder = new SnackandLadder();
		snackandladder.showPosition();
		
		System.out.println("Well Come to SnackLadder Project");
	}

}
