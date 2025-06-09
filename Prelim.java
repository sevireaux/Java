import java.util.*;

public class Prelim
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER YOU ID NO.: ");
		String ID = sc.nextLine();

		System.out.println("ENTER YOUR NAME: ");
		String name = sc.nextLine();

		System.out.println("ENTER YOUR AGE: ");
		int age = sc.nextInt(); sc.nextLine();

		System.out.print("ENTER YOUR GENDER: ");
		String gender = sc.nextLine();

		System.out.println("ENTER YOUR ADDRESS: ");
		String Address = sc.nextLine();

		System.out.println("ENTER YOUR STUDENT STATUS: ");
		String ss = sc.nextLine();

		System.out.println("ENTER YOUR SCHOOL: ");
		String school = sc.nextLine();

		System.out.println("ENTER YOUR DAILY ALLOWANCE: ");
		float da = sc.nextFloat();

		System.out.println("ENTER NO. DAYS OF SCHOOL: ");
		int dos = sc.nextInt();

		System.out.println("************************************");
		System.out.println(" THE FOLLOWING ARE MY INFORMATIONS: ");
		System.out.println("************************************");

		System.out.println("STUDENT'S NO.: " + ID);
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("GENDER: " + gender);
		System.out.println("ADDRESS: " + Address);
		System.out.println("STUDENT STATUS: " + ss);
		System.out.println("SCHOOL: " + school);
		System.out.println("DAILY ALLOWANCE: " + da);
		System.out.println("NO. OF SCHOOL DAYS: " + dos);
		System.out.println("MONTHLY ALLOWANCE: " + da*dos);
	}
}