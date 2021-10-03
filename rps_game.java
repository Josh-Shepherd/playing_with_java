//Import Scanner
import java.util.Scanner;
public class rps_game{
	public static void main(String[] args){
		//username scanner
		Scanner username_scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String username = username_scanner.nextLine();
		System.out.println("Welcome to Rock, Paper, Scissors " + username + "!");

		//user choice scanner		
		Scanner user_choice_scanner = new Scanner(System.in);
		System.out.println("Pick Your Poision: rock, paper or scissors");
		String user_choice = user_choice_scanner.nextLine();
		
		//computer choice
		int rand = (int)(Math.random()*3);
		String computer = "";
		if(rand == 0){
		  computer = "rock";
		}
		else if(rand == 1){
		  computer = "paper";
		}
		else{
		  computer = "scissors";
	      }

	      	//Switch statement for user choice
		switch(user_choice){
			case "rock":
			System.out.println("You've chosen rock!");
			break;

			case "paper":
			System.out.println("You've chosen paper!");
			break;

			case "scissors":
			System.out.println("You've chosen scissors!");
			break;

			default:
			System.out.println("You've chosen... an invalid choice, so please retry!");
			break;
		}

		if(user_choice.equals(computer)){
			System.out.println("It's a tie :0");
		}
		else if(user_choice.equals("rock")&&computer.equals("scissors") || user_choice.equals("paper")&&computer.equals("rock") || 
		user_choice.equals("scissors")&&computer.equals("paper")){
			System.out.println("Congratulations!" + username + "You've won :)");
		}
		else{
			System.out.println("Unfortunately you've lost because the computer chose " + computer + " :(");
		}
	}
}