package com.chetan.snackandladder;

import java.util.Random;

public class SnackandLadder {

	private int playerPosition = 0;
	private int rolldie = 0;
	private int dieOption = 0;
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	private static final int WINNING_POSITION = 100;
	private int dierolecount = 0;
	
	public void showPosition()
	{
		System.out.println("Player Position = " + playerPosition );
	}
	public void playgame()
	{
		Random random = new Random();
		
		while(playerPosition < WINNING_POSITION)
		{
			
		rolldie = random.nextInt(6)+1;
		System.out.println("Player Die Roll = " + rolldie);
		
	   dieOption = random.nextInt(3);
	   System.out.println("Die Option = " + dieOption);
	   System.out.println("-------------------------------------");
	   
	   dierolecount +=1;
	   
	   switch(dieOption)
	   {
	   case NO_PLAY:
		   
		   playerPosition = playerPosition ;
		   break ;
		   
	   case LADDER:
		   
		   playerPosition = playerPosition + rolldie;
		   break;
		   
	   case SNAKE:
		   
		   playerPosition = playerPosition - rolldie;
		   if(playerPosition < 0)
		   {
		      playerPosition = 0;
	       }
		   break;
	   }
	   if(playerPosition > WINNING_POSITION)
	   {
		   playerPosition = playerPosition - rolldie;
	   }
	    showPosition();
	   
		}
		 System.out.println("Die Role Count = " + dierolecount);
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Well Come to SnackLadder Project");
		
		SnackandLadder snackandladder = new SnackandLadder();
		snackandladder.showPosition();
		snackandladder.playgame();
		
		
		
	}

}
