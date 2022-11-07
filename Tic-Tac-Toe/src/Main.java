import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("************");
		System.out.println("Tic-Tac-Toe!");
		System.out.println("************");
		System.out.println("Please enter the column (A, B or C) and then the row (1, 2, or 3) of your move.");
		
		//Creating the dash-board
		char[][] dashboard = {{' ',' ',' '},
				              {' ',' ',' '},
				              {' ',' ',' '},
							 };
		
		//Showing the dash-board to the user
		printDashboard(dashboard);
		
		Scanner scanner = new Scanner(System.in);
		
		//This loop runs until one of the ifs gets the "false" value and the loop breaks
		//I use it to basically run the game session
		while(true) {
			playerMoves(dashboard, scanner);
			if(hasGameEnded(dashboard)) {
				break;
			}
			printDashboard(dashboard);
			compPlay(dashboard);
			if(hasGameEnded(dashboard)) {
				break;
			}
		}
		
		scanner.close(); //Closing the stream (it is not necessary in this program but it is good to have it)
	}
	
	//This method checks if either the player or the computer has won or if the game is a tie. It also uses the "winnerCheck" method to determine if the player or the computer has won
	private static boolean hasGameEnded(char[][] dashboard) {
		
		if (winnerCheck(dashboard, 'X')) {
			printDashboard(dashboard);
			System.out.println("You win!");
			return true;
		}
		
		if (winnerCheck(dashboard, 'O')) {
			printDashboard(dashboard);
			System.out.println("Computer wins!");
			return true;
		}
		
		
		for(int i = 0; i<dashboard.length; i++) {
			for(int j = 0; j<dashboard[i].length; j++) {
				if(dashboard[i][j] == ' ') {
					return false;
				}
			}	
		}
		printDashboard(dashboard);
		System.out.println("It's a tie!");
		return true;
	}

	//This method checks if there are 3 symbols aligned next to each other
	private static boolean winnerCheck(char[][] dashboard, char symbol) {
		if ((dashboard[0][0] == symbol && dashboard [0][1] == symbol && dashboard [0][2] == symbol) ||
			(dashboard[1][0] == symbol && dashboard [1][1] == symbol && dashboard [1][2] == symbol) ||
			(dashboard[2][0] == symbol && dashboard [2][1] == symbol && dashboard [2][2] == symbol) ||
				
			(dashboard[0][0] == symbol && dashboard [1][0] == symbol && dashboard [2][0] == symbol) ||
			(dashboard[0][1] == symbol && dashboard [1][1] == symbol && dashboard [2][1] == symbol) ||
			(dashboard[0][2] == symbol && dashboard [1][2] == symbol && dashboard [2][2] == symbol) ||
				
			(dashboard[0][0] == symbol && dashboard [1][1] == symbol && dashboard [2][2] == symbol) ||
			(dashboard[0][2] == symbol && dashboard [1][1] == symbol && dashboard [2][0] == symbol) ) {
				
				return true;
			}else {
				return false;
			}
	}

	//This method simulates the computer's play move using a pseudo-random number (Java Random library)
	private static void compPlay(char[][] dashboard) {
		Random randomNum = new Random();
		int compMove;
		while(true) {
			compMove = randomNum.nextInt(9)+1;
			if(slotCheck(dashboard, Integer.toString(compMove))) {
				break;
			}
		}
		System.out.println("Computer Move (O): " + compMove);
		placeMove(dashboard, Integer.toString(compMove), 'O');
		printDashboard(dashboard);
	}
	
	//This method checks if a slot on the dash-board is occupied
	private static boolean slotCheck(char[][] dashboard, String slot) {
		switch(slot) {
		case "1":
		case "A1":
			return (dashboard[0][0] == ' ');
		case "2":
		case "B1":
			return (dashboard[0][1] == ' ');
		case "3":
		case "C1":
			return (dashboard[0][2] == ' ');
		case "4":
		case "A2":
			return (dashboard[1][0] == ' ');
		case "5":
		case "B2":
			return (dashboard[1][1] == ' ');
		case "6":
		case "C2":
			return (dashboard[1][2] == ' ');
		case "7":
		case "A3":
			return (dashboard[2][0] == ' ');
		case "8":
		case "B3":
			return (dashboard[2][1] == ' ');
		case "9":
		case "C3":
			return (dashboard[2][2] == ' ');
		default:
			return false;
	}
	}
		
	//This method receives the player's input and places the X symbol where the player wants to using the placeMove method 
	private static void playerMoves(char[][] dashboard, Scanner scanner) {
		String userInput;
		while(true) {
			System.out.println("Player Move (X): ");
			userInput = scanner.nextLine();
			if(slotCheck(dashboard, userInput)) {
				break;
			}else {
				System.out.println("The space entered is already taken.");
			}
		}
		placeMove(dashboard, userInput, 'X');
	}
 	
	//This method places either the player's or the computer's move on the dash-board
	private static void placeMove(char[][] dashboard, String playerMove, char symbol) {
		switch(playerMove) {
			case "A1":
			case "1":
				dashboard[0][0] = symbol;
				break;
			case "B1":
			case "2":
				dashboard[0][1] = symbol;
				break;
			case "C1":
			case "3":
				dashboard[0][2] = symbol;
				break;
			case "A2":
			case "4":
				dashboard[1][0] = symbol;
				break;
			case "B2":
			case "5":
				dashboard[1][1] = symbol;
				break;
			case "C2":
			case "6":
				dashboard[1][2] = symbol;
				break;
			case "A3":
			case "7":
				dashboard[2][0] = symbol;
				break;
			case "B3":
			case "8":
				dashboard[2][1] = symbol;
				break;
			case "C3":
			case "9":
				dashboard[2][2] = symbol;
				break;
			default:
				System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).");
		}
	}
	
	// This method print the game dash-board to the console
	private static void printDashboard(char[][] dashboard) {
		System.out.println("   A " + "B " + "C");
		for(int i = 0; i<3; i++) {
			System.out.print(i+1+ " |");
			for(int j = 0; j<3; j++) {
				System.out.print( dashboard[i][j] + "|");
			}
			System.out.println("");
		}
	}

}

//Made by Panagiotis Boga for a uni exercise in java || https://linktr.ee/panosboga