
import java.util.Scanner;

public class FinalExam_Corpuz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter the number of calculations you want to perform: ");
		int numCalculations = scanner.nextInt();


		for (int i = 1; i <= numCalculations; i++) {
			System.out.print("Enter operand 1 for calculation " + i + ": ");
			double operand1 = scanner.nextDouble();

			System.out.print("Enter operator (+, -, *, /) for calculation " + i + ": ");
			char operator = scanner.next().charAt(0);

			System.out.print("Enter operand 2 for calculation " + i + ": ");
			double operand2 = scanner.nextDouble();


			double result = 0;
			switch (operator) {
				case '+':
					result = operand1 + operand2;
					break;
				case '-':
					result = operand1 - operand2;
					break;
				case '*':
					result = operand1 * operand2;
					break;
				case '/':
					if (operand2 == 0) {
						System.out.println("Error: Cannot divide by zero.");
					} else {
						result = operand1 / operand2;
					}
					break;
				default:
					System.out.println("Invalid operator.");
			}


			System.out.println("Calculation " + i + ": " + operand1 + " " + operator + " " + operand2 + " = " + result);
		}

 		System.out.println("...Program finished with exit code 0");
		System.out.println("Press ENTER to exit console.");

		scanner.nextLine();
		scanner.close();
	}
}