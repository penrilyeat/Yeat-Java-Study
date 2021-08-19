import java.util.Scanner;

public class CalculateCircleArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		/*We are storing the entered radius in double
		 * because a user can enter radius in decimals
		 */
		double radius=sc.nextDouble();
		//Area =PI*radius*radius
		double area=Math.PI*radius*radius;
		System.out.println("The area of circle is: "+area);
		//Circumference =2*PI*radius
		double circumference=Math.PI*2*radius;
		System.out.println("The circumference of the circle is: "+circumference);
	}
}
