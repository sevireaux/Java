import java.util.Scanner;
public class MidtermExam {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Welcom to lotto number game, best of luck. ");
		System.out.println("These are the your alternative types of lotto draws. ");
		System.out.println("1. Ultra Lotto 6/58");
		System.out.println("2.Grand Lotto 6/55");
		System.out.println("3.Super Lotto 6/49");
		System.out.println("4.Mega Lotto 6/45");
		System.out.println("5.Lotto 6/42");
		System.out.println("PLEASE ENTER YOUR TYPE OF LOTTO DRAW (1,2,3,4,5): ");
		 int LottoType = sc.nextInt();
		 sc.nextLine();
		 int maxNumber = 0;
		 String lottoType = "";
		 switch (LottoType) {
			 case 1:
			 maxNumber = 58;
			 lottoType = "Ultra Lotto";
			 break;
			 case 2:
			 maxNumber = 55;
			 lottoType = "Grand Lotto";
			 break;
			 case 3:
			 maxNumber = 49;
			 lottoType = "Super Lotto";
			 break;
			 case 4:
			 maxNumber = 45;
			 lottoType = "Mega Lotto";
			 case 5:
			 maxNumber = 42;
			 lottoType = "Lotto";
			 break;
			 default:
			 System.out.println("Invalid lotto choice.");
			 return;
		 }
		 System.out.println("These are your " + lottoType + " number:");
		   for (int i =  1; i <= maxNumber; i++) {
			   System.out.println(i);
		   }
		   System.out.println("Please choose your Lucky Numbers: ");
		   String[] luckyNumbers = new String[6];
		   for (int i = 0; i < 6; i++) {
			   luckyNumbers[i] = sc.nextLine();
		   }
		   System.out.println("These are your " + lottoType + " lucky numbers: ");
		   System.out.println(String.join(", ", luckyNumbers));
		   System.out.println(" ");
		   System.out.println("Congratulations! You still have to bet to go your nearest lotto betting stations to boost your chances of winning.");
		   System.out.println("Please bet respectfully, Good luck! ");
	   }
   }



