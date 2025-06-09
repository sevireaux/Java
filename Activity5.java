import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your limit number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your loop number: ");
        int num2 = scanner.nextInt();

        System.out.print("Do you want to 'Increase' or 'Decrease' it? ");
        String operation = scanner.next();

        scanner.close();

        int length = 0;
        if (operation.equalsIgnoreCase("Increase")) {
            length = num1 / num2;
        } else if (operation.equalsIgnoreCase("Decrease")) {
            length = num1 / num2 + 1;
        } else {
            System.out.println("Invalid operation. Please enter 'Increase' or 'Decrease'.");
            return;
        }

        int[] sequence = new int[length];

        if (operation.equalsIgnoreCase("Increase")) {
            for (int i = 0; i < length; i++) {
                sequence[i] = num2 * (i + 1);
            }
        } else if (operation.equalsIgnoreCase("Decrease")) {
            for (int i = 0; i < length; i++) {
                sequence[i] = num1 - (i * num2);
            }
        }

        System.out.println("Generated Sequence:");
        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}
