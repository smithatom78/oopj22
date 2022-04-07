package module1;
import java.util.Scanner;
public class ReadingInput {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
  // String input
	     System.out.println("Enter the Name:");
	     String name = sc.nextLine();
	  // Numerical data input,byte, short and float can be read
		System.out.println("Enter the age:");
	     int age = sc.nextInt();
	     System.out.println("Enter the Mobile Number:");
	     long mobileNo = sc.nextLong();
	     System.out.println("Enter the cgpa:");
	     double cgpa = sc.nextDouble();
	}
}
