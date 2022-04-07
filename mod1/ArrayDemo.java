package module1;
import java.util.Arrays;
public class ArrayDemo {
	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		Arrays.sort(intArr);
		//String sArr[]= {"xyz","abc","pqr"};
		//Arrays.sort(sArr);
		System.out.println("The sorted Array is:");
		for(int element:intArr) {
	//	for(String element:sArr) {
			System.out.print(element+" ");
		}

	}

}
