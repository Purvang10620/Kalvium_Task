//Java program for Rock, Paper, Scissors Game 

import java.util.Scanner;
//Importing the Random class of util package for selecting ramdom value from given range
import java.util.Random;

//Main Class
public class RockPaperScissor 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int userScore = 0;
		int computerScore = 0;
    
		int x=1;
		while (x==1) 
		{
			//Getting User Move using Scannet function
		
			System.out.println("Enter your move: (rock, paper, scissors)");
			String userMove = input.nextLine();

			// Generating Computer Move using random Function
			int computerMove = random.nextInt(3);
			String computerMoveString = "";
			
			switch (computerMove) 
			{
				case 0:
					computerMoveString = "rock";
				break;
        
				case 1:
					computerMoveString = "paper";
				break;
				
				case 2:
					computerMoveString = "scissors";
				break;
			}
		
			System.out.println("Computer chose " + computerMoveString + "!");
			// Winning conditions
			
			if (userMove.equals("rock")) 
			{
				// tie conditions as same move
				if (computerMoveString.equals("rock")) 
				{
					System.out.println("Tie!");
				} 
				//Paper wraps rock
				else if (computerMoveString.equals("paper")) 
				{
					System.out.println("Computer wins!");
					computerScore++;
				} 
				//The rock smashes the scissor
				else 
				{
					System.out.println("You win!");
					userScore++;
				}
			} 
			else if (userMove.equals("paper")) 
			{
				//Paper wraps rock
				if (computerMoveString.equals("rock")) 
				{
					System.out.println("You win!");
					userScore++;
				} 
				// tie conditions as same move
				else if (computerMoveString.equals("paper")) 
				{
					System.out.println("Tie!");
				} 
				//Scissors cuts paper
				else 
				{
					System.out.println("Computer wins!");
					computerScore++;
				}
			} 
			else if (userMove.equals("scissors")) 
			{	
				//The rock smashes the scissor
				if (computerMoveString.equals("rock")) 
				{
					System.out.println("Computer wins!");
					computerScore++;
				} 
				//Scissors cuts paper
				else if (computerMoveString.equals("paper")) 
				{
					System.out.println("You win!");
					userScore++;
				} 
				// tie conditions as same move
				else 
				{
					System.out.println("Tie!");
				}
			}
			else 
			{
				System.out.println("Invalid input, please try again.");
				continue;
			}
			System.out.println("Do You Want to continue (Y/N)");
			String c=input.nextLine();
			if(c.equalsIgnoreCase("n"))
			{
				x=0;
			}
		}
		
		//printing user and computer score
		System.out.println("Final score: You " + userScore + " - Computer " + computerScore);
    
	
	}
}
