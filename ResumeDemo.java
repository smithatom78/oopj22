package module4;
class JavaResumeExp extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);      
                // System.out.println(Thread.currentThread().getName()); 
                 System.out.println(i);
            }catch(InterruptedException e){System.out.println(e);}    
          
        }    
    }    
    
}  
public class ResumeDemo {
	public static void main(String args[])  
    {    
        // creating three threads   
        JavaResumeExp t1=new JavaResumeExp ();    
        JavaResumeExp t2=new JavaResumeExp ();
        t1.start();  
        t2.start();  
        t2.suspend();  
        JavaResumeExp t3=new JavaResumeExp ();   
        // call run() method   
        // suspend t2 thread   
        // call run() method   
        t3.start();   
        t2.resume(); // resume t2 thread  
    }    
}
