import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		/* for loop version */
		// We will find the factorial of this number
//		int number=5;
//		long fact=1;
//		
//		for(int i=1;i<=number;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("Factorial of "+number+" is: "+fact);

		/* while loop version */
		// We will find the factorial of this number
//		int number=5;
//		long fact=1;
//		int i=1;
//		while(i<=number)
//		{
//			fact=fact*i;
//			i++;
//		}
//		System.out.println("Factorial of "+number+" is: "+fact);

		/* While loop user define number */
		int number;
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		scanner.close();
		long fact = 1;
		int i = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
