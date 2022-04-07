package module3;
import java.util.Scanner;
public class Except2 {
	 public static void main(String args[]) {
	      try {
  
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter a:");
				int a1 = sc.nextInt();
				System.out.print("Enter b:");
				int b1 = sc.nextInt();
				int div=a1/b1;
				System.out.print("res="+div);
	      } catch (Exception e) {
	         System.out.println("Exception thrown  :" + e);
	    	  System.out.println(e.getMessage());
	      }
	      System.out.println("Out of the block");
	      
	   }

}
