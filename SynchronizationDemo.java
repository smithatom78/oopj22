package module4;

class MultiplicationTable{  
	synchronized void printMultiplicationTable(int n){//method synchronized  
//	void printMultiplicationTable(int n){//method not synchronized  
	//synchronized (this) { // Synchronized block
			for(int i=1;i<=10;i++){  
				System.out.println(i+"x"+n+"="+n*i);  
				try{  
					Thread.sleep(400);  
				}catch(Exception e){System.out.println(e);}  
			}  
		
	//}
  }  
}  
  
class MyThread2 extends Thread{
	MultiplicationTable t;
	MyThread2(MultiplicationTable t){
		this.t=t;  
	}  
	public void run(){
		t.printMultiplicationTable(5); 
	}  
  
}  
class MyThread3 extends Thread{
	MultiplicationTable t;  
	MyThread3(MultiplicationTable t){  
		this.t=t;  
	}  
	public void run(){  
		t.printMultiplicationTable(100);
	}  
}  
  
class SynchronizationDemo{  
	public static void main(String args[]){
		MultiplicationTable obj = new MultiplicationTable();//only one object  
		MyThread2 t1=new MyThread2(obj);  
		MyThread3 t2=new MyThread3(obj);  
		t1.start();  
		t2.start();  
	}  
}  