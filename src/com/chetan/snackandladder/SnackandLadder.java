package com.chetan.snackandladder;

import java.util.Random;

public class SnackandLadder {

	private int playerPosition = 0;
	private int rolldie = 0;
	
	public void showPosition()
	{
		System.out.println("Player Position = " + playerPosition );
	}
	public void playgame()
	{
		Random random = new Random();
		rolldie = random.nextInt(6)+1;
		System.out.println("Player Die Roll = " + rolldie);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Well Come to SnackLadder Project");
		
		SnackandLadder snackandladder = new SnackandLadder();
		snackandladder.showPosition();
		snackandladder.playgame();
		
		
	}

}
