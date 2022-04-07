package module4;
class OddNumbers1{
	public void generateOddNumbers() {
		for(int i=1;i<50;i+=2) {
			System.out.println("Odd Number Generated"+i);
		}
	}
}
class EvenNumbers1{
	public void generateEvenNumbers() {
		for(int i=2;i<100;i+=2) {
			System.out.println("Even Number Generated"+i);
		}
	}
}
public class Test{
	public static void main(String[] args) {
		OddNumbers1 oddNumbers = new OddNumbers1();
		EvenNumbers1 evenNumbers = new EvenNumbers1();
		oddNumbers.generateOddNumbers();
		evenNumbers.generateEvenNumbers();
	}

}
