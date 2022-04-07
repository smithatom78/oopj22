package module3;
import java.util.Scanner;
class checkEligibility
{
	void check(int t1,int t2)
	{ 
		if(t1<12 && t2<40) {
			 throw new ArithmeticException("not eligible");
			}else
		{
			System.out.println("registration valid");
		}
	}
}
public class Except4 {
	 public static void main(String args[]) {
	         
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter age:");
				int age = sc.nextInt();
				System.out.print("Enter weight:");
				int wt = sc.nextInt();
				checkEligibility c=new 	checkEligibility();
				//c.check(age,wt);
			try {
				c.check(age,wt);
				}
			catch(ArithmeticException e)
			{
			System.out.println(e);}
			System.out.println("thank you for registering");
	   		}
	 }

