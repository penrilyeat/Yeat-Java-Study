import java.util.Scanner;

public class GetInput {
	public static void main(String[] args) {
		int num;
		float fnum;
		String str;
		
		//Get input String
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=in.nextLine();
		System.out.println("Input String is: "+str);
		
		//Get input Integer
		System.out.println("Enter an integer");
		num=in.nextInt();
		System.out.println("Input Integer is: "+num);
		
		//Get input float number
		System.out.println("Enter a float number");
		fnum=in.nextFloat();
		System.out.println("input Float number is: "+fnum);
	}
}
