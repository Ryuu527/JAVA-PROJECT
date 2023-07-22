package Boat_Racing_Assignment;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Menu {

	public static char getPlayAgain() {
		return playAgain;
	}

	public static void setPlayAgain(char playAgain) {
		Menu.playAgain = playAgain;
	}

	public static char playAgain = 'y';

	public static int getCounter1() {
		return counter1;
	}

	public static void setCounter1(int counter1) {
		Menu.counter1 = counter1;
	}

	public static int getCounter2() {
		return counter2;
	}

	public static void setCounter2(int counter2) {
		Menu.counter2 = counter2;
	}

	public static int counter1 = 0 ;
	public static int counter2 = 0 ;




	public static boolean isPlayer1Turn() {
		return player1Turn;
	}

	public static void setPlayer1Turn(boolean player1Turn) {
		Menu.player1Turn = player1Turn;
	}

	public static boolean player1Turn = true;

	public static boolean isPlayer2Turn() {
		return player2Turn;
	}

	public static void setPlayer2Turn(boolean player2Turn) {
		Menu.player2Turn = player2Turn;
	}

	public static boolean player2Turn = true;


	public static int getPlayer1Position() {
		return player1Position;
	}

	public static void setPlayer1Position(int player1Position) {
		Menu.player1Position = player1Position + Dice.getDiceRoll();
	}

	public static int player1Position = 0;

	public boolean playerTurn = true;

	public static boolean isGameEnd() {
		return gameEnd;
	}

	public void setGameEnd(boolean gameEnd) {
		this.gameEnd = gameEnd;
	}

	private static boolean gameEnd = false;
	public static int count = 0;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Menu.count = count;
	}

	static void gameRules(){
      System.out.println("------------------------------------------------------GAME RULES : ------------------------------------------------------");
      System.out.println("                                            1. To roll the dice, press m ");
      System.out.println("                          2. The players will move to the spot based on the number shown on the dice");
      System.out.println("                          3. There are currents and traps scattered randomly throughout the board, ");
      System.out.println("       4. Currents are good, as they move you forward a random number, and traps are bad, as they move you backwards ");
      System.out.println("                       5. To win the game, reach the end of the board piece with one lucky last roll.");
      System.out.println("                                                     6. ENJOY :)");
      System.out.println("-------------------------------------------------------------------------------------------------------------------------");
  }


/*
	public static void topScores() throws IOException {
	  try {
		  FileWriter myWriter = new FileWriter("TopScore.txt");
		  myWriter.write("Files in Java might be tricky, but it is fun enough!");
		  myWriter.close();
		  System.out.println("Successfully wrote to the file.");
	  } catch (IOException e) {
		  System.out.println("An error occurred.");
		  e.printStackTrace();
	  }
	}
 */




	public static void saveToFile(String file, String text, String playerName, int count, boolean append) {
	    try {
			File f = new File("TopScore.txt");
			FileWriter fw = new FileWriter(f, append);
			PrintWriter pw = new PrintWriter(fw);

			pw.print(text);
			pw.print(playerName);
			pw.print(count);
			pw.close();
		} catch(IOException e) {
			System.out.println("Error: saveToFile");
		}

	}








  static void gameIcons() {
	  System.out.println("---------------\uD83C\uDF0A Game Icons Representations: \uD83C\uDF0A-----------------");
	  System.out.println("                   1. Player 1 : \uD83D\uDEA3");
	  System.out.println("                   2. Player 2 : ⛵");
	  System.out.println("                   3. Traps : \uD83C\uDF2A");
	  System.out.println("                   4. Currents : \uD83C\uDF0A");
	  System.out.println("------------------------------------------------------------------");
  }

  public static void quitGame() {
	  System.out.println("Thank you for playing :)");
  }








  
  public static <Char> void main(String[] args) throws IOException {
	  Scanner scan = new Scanner(System.in);


		  //ART + INSTRUCTIONS
		  System.out.print(
				  "▒█▀▀█ ▒█▀▀▀█ ░█▀▀█ ▀▀█▀▀ 　 ▒█▀▀█ ░█▀▀█ ▒█▀▀█ ▀█▀ ▒█▄░▒█ ▒█▀▀█ 　 ▒█▀▀█ ░█▀▀█ ▒█▀▄▀█ ▒█▀▀▀\n" +
						  "▒█▀▀▄ ▒█░░▒█ ▒█▄▄█ ░▒█░░ 　 ▒█▄▄▀ ▒█▄▄█ ▒█░░░ ▒█░ ▒█▒█▒█ ▒█░▄▄ 　 ▒█░▄▄ ▒█▄▄█ ▒█▒█▒█ ▒█▀▀▀\n" +
						  "▒█▄▄█ ▒█▄▄▄█ ▒█░▒█ ░▒█░░ 　 ▒█░▒█ ▒█░▒█ ▒█▄▄█ ▄█▄ ▒█░░▀█ ▒█▄▄█ 　 ▒█▄▄█ ▒█░▒█ ▒█░░▒█ ▒█▄▄▄\n\n"
		  );

		  System.out.println("-------------🚣‍♂ Welcome to Boat Racing game 🚣‍♂️-------------");
		  System.out.println("                   1. to play the game (press a)");
		  System.out.println("                   2. to view instructions (press s)");
		  System.out.println("                   3. to view icon representations (press d)");
		  System.out.println("                   4. to quit game (press w)");
		  System.out.println("------------------------------------------------------------------");

		  try (BufferedReader br = new BufferedReader(new FileReader("TopScore.txt"))) {
			  String line;
			  while ((line = br.readLine()) != null) {
				  System.out.println(line);

			  }
		  }


		  System.out.println();

		  System.out.print("‧₊˚ ₊     ₊˚ ₊      ˚\n");
		  System.out.print(" ˚  ‧₊˚  \uD83C\uDF1B  ₊˚  ‧˚\n");
		  System.out.print("˚\uD83C\uDFD6‿︵‿︵‿︵‿︵\n");
		  System.out.println("        .˚ ̥ \uD83D\uDC1F .˚\uD83D\uDC1F \n");


		  boolean correctInput = true;
		  while (correctInput) {
			  Scanner myObj = new Scanner(System.in);
			  System.out.println("Enter (a - play game), (s- instructions), (d- icons), (w- quit) : ");
			  String user_input = myObj.nextLine();  // Read user input
			  System.out.println("input entered: " + user_input);  // Output user input

			  boolean p1sTurn = false;

			  //Step after user input 'a','s','d' or 'w'
			  switch (user_input) {
				  case "a" -> {

					  Scanner player1 = new Scanner(System.in);
					  System.out.println("Enter player 1 : ");
					  String input_player1 = player1.nextLine();  // Read user input
					  Scanner player2 = new Scanner(System.in);
					  System.out.println("Enter player 2 : ");
					  String input_player2 = player2.nextLine();  // Read user input
					  System.out.println("PLAYER 1: " + input_player1);  // Output user input
					  System.out.println("PLAYER 2: " + input_player2);  // Output user input
					  correctInput = false;


					  //create new object GamePlay
					  while (!gameEnd) {
						  GamePlay gp;
						  String yes = "yes";
						  gp = new GamePlay();


						  player2Turn = false;
						  if (player1Turn) {
							  player1Turn = true;

							  boardTable.boardGame();

							  String m2 = "m";
							  System.out.println("Player 1 current position : " + boardTable.PlayerPosition);

							  if (boardTable.getPlayerPosition() >= 99) {
								  System.out.println("WINNER : PLAYER 2-" + input_player2 + Players.getPlayer2() + "WON THE GAME!");
								  System.out.println("number of steps taken (Score) :" + counter1);
								  saveToFile("TopScore", "\nPlayer2 ", input_player2, counter2, true);
								  break;
							  }
							  if (boardTable.getPlayer2Position() >= 99) {
								  System.out.println("WINNER : PLAYER 1-" + input_player1 + Players.getPlayer1() + "WON THE GAME!");
								  System.out.println("number of steps taken (Score) :" + counter1);
								  saveToFile("TopScore", "\nPlayer1 ", input_player1, counter1, true);
								  break;
							  }
							  System.out.println("Player 2: " + input_player2 + "'s" + Players.getPlayer2() + "Turn");

							  Scanner scanner2 = new Scanner(System.in);
							  System.out.println("Roll the dice (press: m)");
							  String playerTurn2 = scanner2.nextLine();
							  player2Turn = true;
						  }
						  counter1++;


						  if (player2Turn) {
							  boardTable.boardGame();

							  String m = "m";
							  System.out.println("Player 2 current position: " + boardTable.Player2Position);
							  if (boardTable.getPlayerPosition() >= 99) {
								  System.out.println("WINNER : PLAYER 1-" + input_player1 + Players.getPlayer1() + "WON THE GAME!");
								  System.out.println("number of steps taken (Score) :" + counter1);
								  saveToFile("TopScore", "\nPlayer1 ", input_player1, counter1, true);
								  break;
							  }
							  if (boardTable.getPlayer2Position() >= 99) {
								  System.out.println("WINNER : PLAYER 2-" + input_player2 + Players.getPlayer2() + "WON THE GAME!");
								  System.out.println("number of steps taken (Score) :" + counter1);
								  saveToFile("TopScore", "\nPlayer2 ", input_player2, counter2, true);
								  break;
							  }

							  System.out.println("Player 1: " + input_player1 + "'s" + Players.getPlayer1() + "Turn");
							  Scanner scanner = new Scanner(System.in);
							  System.out.println("Roll the dice (press: m)");
							  String playerTurns1 = scanner.nextLine();
							  player2Turn = false;
							  player1Turn = true;

						  }
						  counter2++;


						/*
						Dice dice1;
						dice1 = new Dice();
						dice1.roll();
						int diceValue = dice1.getDice();
						boardTable.player1Position += diceValue;


						System.out.println("P1 moved to position : " + boardTable.getPlayer1Position());
						if (boardTable.getPlayer1Position() == 100) {
							g.gameWon = true;
							System.out.println("Congratulations !" + player1 + "You won");
 							gameEnd = true;
						}


						count++;

						 */
						  count++;
					  }

				  }
				  case "s" -> gameRules();
				  case "d" -> gameIcons();
				  case "w" -> {
					  quitGame();
					  correctInput = false;
				  }
			  }
			  for (int i = 0; i < 3; i++) {
				  System.out.print("\n");
			  }
		  }

	  }


}


