package module4;

	class NewThread implements Runnable
	{ String name;
	NewThread(String threadname)
	{name = threadname;
	System.out.println("New thread: " + name);
	}
	public void run()
	{
	try 
	{
		for(int i = 5; i > 0; i--)
		{ 
		System.out.println(name + ": " + i);
		Thread.sleep(1000);
		}
	}
	catch (InterruptedException e)
	{
		System.out.println(name +"Interrupted");
	}
	System.out.println(name + " exiting.");
	}
	}
class MyThread5
	{
	public static void main(String args[])
	{
	Thread t = new Thread(new NewThread("One"));
	Thread t1 = new Thread(new NewThread("Two"));
	Thread t2 = new Thread(new NewThread("Three"));
	t.start();
	t1.start();
	t2.start();
	try{
	Thread.sleep(10000);
	} catch (InterruptedException e)
	{ System.out.println("Main thread Interrupted");
	}
	System.out.println("Main thread exiting.");
	}
	}

