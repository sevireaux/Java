import java.util.*;

public class Activity5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int multiplier = 1;
		System.out.println("Multiplication Table for " + number + ":");

		do {
				int product = number*multiplier;
				System.out.println(number + " x " + multiplier + " = " + product);
				multiplier++;
			}

		while (multiplier < 11);
	}
}

