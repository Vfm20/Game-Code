package java_Tutorial_For_Beginners;

import java.util.Scanner;

import java.util.Random;

public class gameCode {
	
	public static void printMainMenu() {
		System.out.println("-----Welcome to Never Have I Dared-----");
		System.out.println("              1. New Game                ");
		System.out.println("              2. Rules                   ");
		System.out.println("              3. Exit                    ");
	}
	
	public static int winner(int player_one_score, int player_two_score, int player_three_score, int player_four_score) {
		return Math.min(Math.min(player_one_score, player_two_score), Math.min(player_three_score, player_four_score));
	}
		

	public static void main(String[] args) {
		Random generator = new Random();
		int menu_choice;
		int winner_player;
		int new_question;
		int number_of_questions = 30;
		int player_one_score = 0;
		int player_two_score = 0;
		int player_three_score = 0;
		int player_four_score = 0;
		String player_one_name;
		String player_two_name;
		String player_three_name;
		String player_four_name;
		String player_one_choice;
		String player_two_choice;
		String player_three_choice;
		String player_four_choice;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			printMainMenu();
			menu_choice = keyboard.nextInt();
			
			switch(menu_choice) {
			case 1:
				System.out.println("Enter Player 1's Name here: ");
				player_one_name = keyboard.nextLine();
				
				System.out.print("Enter Player 2's Name here: ");
				player_two_name = keyboard.nextLine();
				
				System.out.println();
				
				System.out.print("Enter Player 3's Name here:");
				player_three_name = keyboard.nextLine();
				
				System.out.println();
				
				System.out.print("Enter Player 4's Name here: ");
				player_four_name = keyboard.nextLine();
				
				System.out.println();
				
				for(int i = 0; i <= number_of_questions; i++) {
				new_question = generator.nextInt(31);
				
				switch(new_question) {
				case 1:
					System.out.println("Never have I ever broken a bone.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 2:
					System.out.println("Never have I ever Googled myself.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 3:
					System.out.println("Never have I ever traveled solo.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					
				case 4:
					System.out.println("Never have I ever toliet-papered someone's house.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 5:
					System.out.println("Never have I ever met a celebrity.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 6:
					System.out.println("Never have I ever sleepwalked.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 7:
					System.out.println("Never have I ever read an entire book in one day.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 8:
					System.out.println("Never have I ever gone to a party I wasn't invited to.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 9:
					System.out.println("Never have I ever stayed up all night.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 10:
					System.out.println("Never have I ever gone on a blind date.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 11:
					System.out.println("Never have I ever used a fake ID.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 12:
					System.out.println("Never have I ever been hungover.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 13:
					System.out.println("Never have I ever cheated on a test.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 14:
					System.out.println("Never have I ever given/gotten a hickey.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 15:
					System.out.println("Never have I ever been fired.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 16:
					System.out.println("Never have I ever stood up a date.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 17:
					System.out.println("Never have I ever shoplifted.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 18:
					System.out.println("Never have I ever broken clogged a toilet.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 19:
					System.out.println("Never have I ever been on TV.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 20:
					System.out.println("Never have I ever gone commando.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 21:
					System.out.println("Never have I ever lied about where I was to my parents.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 22:
					System.out.println("Never have I ever been on a cruise.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 23:
					System.out.println("Never have I ever rode a motorcycle.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 24:
					System.out.println("Never have I ever dyed my hair.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 25:
					System.out.println("Never have I ever seen a wild animal in real life.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 26:
					System.out.println("Never have I ever been on a group date.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 27:
					System.out.println("Never have I ever been in a fight.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 28:
					System.out.println("Never have I ever left someone on read.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 29:
					System.out.println("Never have I ever given a massage.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				case 30:
					System.out.println("Never have I ever used a pick-up line.");
					
					System.out.print(player_one_name + ", your answer(Yes/No): ");
					player_one_choice = keyboard.nextLine();
					if(player_one_choice == "Yes") {
						player_one_score++;
					}
					
					System.out.println();
					
					System.out.print(player_two_name + ", your answer(Yes/No): ");
					player_two_choice = keyboard.nextLine();
					if(player_two_choice == "Yes" || player_two_choice == "yes") {
						player_two_score++;
					}
					
					System.out.println();
					
					System.out.print(player_three_name + ", your answer(Yes/No): ");
					player_three_choice = keyboard.nextLine();
					if(player_three_choice == "Yes" || player_three_choice == "yes") {
						player_three_score++;
					}
					
					System.out.println();
					
					System.out.print(player_four_name + ", your answer(Yes/No): ");
					player_four_choice = keyboard.nextLine();
					if(player_four_choice == "Yes" || player_four_choice == "yes") {
						player_four_score++;
					}
					
					System.out.println();
					break;
				}
				
				}
				winner_player = winner(player_one_score, player_two_score, player_three_score, player_four_score);
				System.out.println("Final Scores are:");
				System.out.println(player_one_name + " scored " + player_one_score);
				System.out.println(player_two_name + " scored " + player_two_score);
				System.out.println(player_three_name + " scored " + player_three_score);
				System.out.println(player_four_name + " scored " + player_four_score);
				System.out.println("Whoever scored the least points, which in this case is" + winner_player + " gets to dare the player with the most points. Have fun!!! ");
				break;
			case 2:
				System.out.println("The rules are simple. It's played just like you would play regular Never Have I ever, but there's a twist! Whoever has the least points after 30 questions gets the player with the most points to do whatever they want. Questions are chosen at random, so for any repeated question, every player should answer no.");
				System.out.println();
				break;
			}
			
		}while(menu_choice != 3);

	}

}
