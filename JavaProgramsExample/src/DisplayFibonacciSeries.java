import java.util.Scanner;

public class DisplayFibonacciSeries {
	public static void main(String[] args) {
		// For Loop
//		int count = 7, num1 = 0, num2 = 1;
//		System.out.println("Fibonacci Series of " + count + " numbers: ");
//		for (int i = 1; i <= count; i++) {
//			System.out.println(num1 + " ");
//			/*
//			 * On each iteration, we are assigning second number to the first number and
//			 * assigning the sum of last two numbers to the second number
//			 */
//			int sumOfPrevTwo = num1 + num2;
//			num1 = num2;
//			num2 = sumOfPrevTwo;
//		}
		// While Loop
//		int count = 7, num1 = 0, num2 = 1;
//		System.out.println("Fibonacci Series of " + count + " numbers: ");
//		int i=1;
//		while (i <= count) {
//			System.out.println(num1 + " ");
//			int sumOfPrevTwo = num1 + num2;
//			num1=num2;
//			num2=sumOfPrevTwo;
//			i++;
//		}

		// While Loop User define number
		int count, num1 = 0, num2 = 1;
		System.out.println("How many numbers you want in the sequence:");
		Scanner scanner=new Scanner(System.in);
		count=scanner.nextInt();
		System.out.println("Fibonacci Series of "+count+" numbers:");
		
		int i=1;
		while(i<=count)
		{
			System.out.println(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			i++;
		}

	}
}
