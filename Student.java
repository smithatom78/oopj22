package module3;
import java.util.Scanner;
class Student1
{	int rollno;
	String name;
	String email;
	int phone;
  String college="SJC";
 
 Student1(int rollno,String name,int phone,String email,String college)
	{
	 this.rollno=rollno;
	this.name=name;
	this.email=email;
	this.phone=phone;
	this.college=college;
	}
void display()
	{
	System.out.println(rollno+"\t"+name+"\t "+email+"\t"+phone+"\t "+college)	;
	}
}
public class Student
{
public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
	 
		  System.out.println("Enter the Roll no :");
		   int rollno=sc.nextInt();
		  System.out.println("Enter the Name :");
		   String name=sc.next();
		   System.out.println("Enter the phone no :");
		   int phone=sc.nextInt();
		    System.out.println("Enter the email :");
		   String email=sc.next();
		   System.out.println("Enter the college :");
		   String college=sc.next();
		//	obj[i] = new Student(r,n,ph,em);
		Student1 ob=new Student1(rollno,name,phone,email,college);	 
		// ob.getdata(r, n, ph, em, co);
				ob.display();  
		}

}
