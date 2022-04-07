package module4;
import java.util.*;
class MulTable
{    void printTable(int n)
      {  
      synchronized(this)
     {//synchronized block  
        for(int i=1;i<=5;i++)
        {  
         System.out.println(n+"*"+i+"="+n*i);  
         try{  
         Thread.sleep(400);  
         }
         catch(Exception e)
         {System.out.println(e);}  
        }  
      }  
      }//end of the method  
 }  

class MyTab extends Thread
{  
   MulTable t;  
   int num;
   MyTab(MulTable t,int num)
   {  
   this.t=t;  
   this.num=num;
   }  
   public void run()
   {
   t.printTable(num);  
   }       
}
public class MulThreadSyncDemo {
	public static void main(String args[]){  
		   MulTable obj = new MulTable();//only one object  
		   Scanner s=new Scanner(System.in);
		   System.out.println("Enter the Table you want to run by thread1");
		int num=s.nextInt();
		   MyTab t1=new MyTab(obj,num); 
		   System.out.println("Enter the Table you want to run by thread2");
		   num=s.nextInt();
		   MyTab t2=new MyTab(obj,num);
		   System.out.println("Enter the Table you want to run by thread3");
		   num=s.nextInt();
		   MyTab t3=new MyTab(obj,num);  
		   t1.start();  
		   t2.start();
		   t3.start();  
		   }  

}