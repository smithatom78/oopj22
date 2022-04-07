package module4;

public class ThreadPriorityDemo1 extends Thread{
	public void run()
	      { for(int i=0;i<5;i++)
          { 
		   System.out.println("running thread name is:"+Thread.currentThread().getName()+" and priority is:"+Thread.currentThread().getPriority());  
          }
		  }  
		 public static void main(String args[]){  
			 ThreadPriorityDemo1 firstThread =new ThreadPriorityDemo1();  
			 ThreadPriorityDemo1 secondThread=new ThreadPriorityDemo1(); 
			 firstThread.setName("First Thread");
			 secondThread.setName("Second Thread");
			// firstThread.setPriority(Thread.MIN_PRIORITY);  
			 firstThread.setPriority(8);  
			 secondThread.setPriority(Thread.MAX_PRIORITY);  
			 firstThread.start();  
			 secondThread.start();  
		   
		 }  

}
