package module2;
import java.util.Scanner;
class Employee2{
    
    float basicSalary;
    float daPercentage;
    float hraPercentage;
    float grossSalary;
    
    void calcSalary() {
        grossSalary = basicSalary + (daPercentage*basicSalary/100)+(hraPercentage*basicSalary/100);
        System.out.println("The Gross Salary of EMPLOYEE is"+grossSalary);
    }
    void display(){
    System.out.println("Name of class is EMPLOYEE ");
     
  }
}
class Engineer2 extends Employee2
{void display(){
	super.display();
	super.calcSalary();
	 System.out.println("Name of class is Engineer ");
    System.out.println("The Gross Salary of Engineer is"+grossSalary*2);
}   
}
 class SalaryProgram{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Engineer2 engineer = new Engineer2();
    System.out.println("Enter the Basic Salary of the Employee :");
    engineer.basicSalary=sc.nextFloat();
    System.out.println("Enter the DA of the Employee :");
    engineer.daPercentage=sc.nextFloat();
    System.out.println("Enter the HAR of the Employee:");
    engineer.hraPercentage=sc.nextFloat();
    engineer.display();
   // engineer.calcSalary();
  
    }
}
