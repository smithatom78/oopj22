package module1;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		int counter = +1;        // counter is now 1
        System.out.println(counter);
        
        counter--;        // counter is now 0
        System.out.println(counter);

        counter++;        // counter is now 1
        System.out.println(counter);

        counter = -counter;        // counter is now -1
        System.out.println(counter);

	}

}
