import java.util.*;

public class Activity2
{
public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your First Name: ");
	String Fname = sc.nextLine();

	System.out.println("Enter your last Name: ");
	String Lname = sc.nextLine();

	String FLname = (Fname + " " + Lname);

	System.out.println("============================");
	System.out.println("Full name: " + FLname);
	System.out.println("============================");
	}
}