package module4;
class MyThread extends Thread {  
    public void run()
    {
    	for(int i=0;i<5;i++)
            {
    		System.out.println("thread "+i+"is running ... ");
            }
    }
}  
class ThreadEx 
{  
    public static void main(String [] args  )
	    {
    	MyThread t = new MyThread();
    	t.start();
    	MyThread t1 = new MyThread();
    	t1.start();
	   }
}