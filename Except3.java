package module3;

import java.util.Scanner;

public class Except3 {
	 public static void main(String args[]) {
	      try {      
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter a:");
				int a1 = sc.nextInt();
				System.out.print("Enter b:");
				int b1 = sc.nextInt();
				if (b1==0) {throw new ArithmeticException("division by zero");}
				int div=a1/b1;
				System.out.print("res="+div);
				System.out.println("in try block");
			      
	      } catch (ArithmeticException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	      System.out.println("10/2="+10/2);
	      
	   }

}
