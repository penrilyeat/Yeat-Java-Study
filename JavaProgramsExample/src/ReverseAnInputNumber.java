import java.util.Scanner;

public class ReverseAnInputNumber {
	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			// Method is calling itself: recursion
			reverseMethod(number / 10);
		}
	}

	public static void main(String[] args) {
		/* While Loop */
//		int num=0;
//		int reversenum=0;
//		System.out.println("Input your number and press enter:");
//		//This statement will capture the user input
//		Scanner in=new Scanner(System.in);
//		//Captured input would be stored in number numm
//		num=in.nextInt();
//		//While loop:Logic to find out the reverse number
//		while(num!=0)
//		{
//			reversenum=reversenum*10;
//			reversenum=reversenum+num%10;
//			num=num/10;
//		}
//		System.out.println("Reverse of input number is: "+reversenum);

		/* For Loop */
//		int num = 0;
//		int reversenum = 0;
//		System.out.println("Input your number and press enter: ");
//		// This statement will capture the user input
//		Scanner in = new Scanner(System.in);
//		// Captured input would be stored in number num
//		num = in.nextInt();
//		/*
//		 * for loop: No initialization part as num is already initialized and no
//		 * increment/decrement part as logic num=num/10 already decrements the value of
//		 * num
//		 */
//		for (; num != 0;) {
//			reversenum = reversenum * 10;
//			reversenum = reversenum + num % 10;
//			num = num / 10;
//		}
//		System.out.println("Reverse of specified number is: " + reversenum);

		/*Recursion Method*/
		int num=0;
		System.out.println("Input your number and press enter: ");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		System.out.println("Reverse of the input number is:");
		reverseMethod(num);
		System.out.println();
	}
}
