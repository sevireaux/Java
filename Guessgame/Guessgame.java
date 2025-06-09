import java.util.*;
public class Guessgame {
	Player p1;
	Player p2;
	Player p3;

		public void startGame() {
			Scanner p1 = new Scanner(System.in);
			Scanner p2 = new Scanner(System.in);
			Scanner p3 = new Scanner(System.in);
			
			int guessp1 = 0;
			int guessp2 = 0;
			int guessp3 = 0;

			boolean p1isRight = false;
			boolean p2isRight = false;
			boolean p3isRight = false;

			int targetNumber = (int) (Math.random() * 10);
			System.out.println("I'm thinking of a number between 0 to 9...");

			while(true) {
				System.out.println("Number to guess is " + targetNumber);
				System.out.println(" ");

				System.out.println("Player one, guess the number: ");
				guessp1 = p1.nextInt();
				System.out.println(" ");
				System.out.println("Player two, guess the number: ");
				guessp2 = p2.nextInt();
				System.out.println(" ");
				System.out.println("Player three, guess the number: ");
				guessp3 = p3.nextInt();
				System.out.println(" ");
				
				System.out.println("Player one guessed " + guessp1);
				System.out.println(" ");
				System.out.println("Player two guessed " + guessp2);
				System.out.println(" ");
				System.out.println("Player three guessed " + guessp3);
				System.out.println(" ");

				if (guessp1 == targetNumber) {
					p1isRight = true;
				}
				
				if (guessp2 == targetNumber) {
					p2isRight = true;
				}
				
				if (guessp3 == targetNumber) {
					p3isRight = true;
				}

				if (p1isRight || p2isRight || p3isRight) {
				
					System.out.println("We have a winner");
					System.out.println(" ");
					System.out.println("Player one got it right? " + p1isRight);
					System.out.println(" ");
					System.out.println("Player two got it right? " + p2isRight);
					System.out.println(" ");
					System.out.println("Player three got it right? " + p3isRight);
					System.out.println(" ");
					System.out.println("Game is over");
					System.out.println(" ");
					break;
					
					} else {

					System.out.println("Player will have to try again.");
					}
			}
		}
	}


