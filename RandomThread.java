package module4;
import java.util.Random;
class EvenThread extends Thread
{
private int num;
	public EvenThread(int num)
	{
	this.num = num;
	}
	public void run()
	{
	System.out.println("Square of"+ num+"="+num*num);
	}
}
class OddThread extends Thread
{
private int num;
	public OddThread(int num)
	{
	this.num = num;
	}
	public void run()
	{
	System.out.println("Cube of "+num+"="+ num*num*num);
	}
}
class RandThread extends Thread
{
public void run()
	{
	Random r = new Random();
	for(int i =0;i<10;i++)
		{
		  try 
			{ int num = r.nextInt(100);
			//  System.out.print(num + "\n "); 
			 Thread.sleep(1000);
			 if(num % 2 == 0)
				{
					EvenThread et=new EvenThread(num);
					et.start();
				}
				else
				{
				new OddThread(num).start();
				}
      } 
      catch (Exception e) { 
          System.out.println(e); 
      } 
		
			
		}
	}
}
class RandomThread
{
	public static void main(String args[])
	{
	RandThread r = new RandThread();
	r.start();
	}
}
