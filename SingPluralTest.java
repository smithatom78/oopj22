package module4;
import java.util.*;
import java.io.*;
public class SingPluralTest {
		public static void main(String args[]){
		try{
			/*System.out.println("Enter the file name");
			Scanner f = new Scanner(System.in);
			String fname=f.next();
			//System.out.println(fname);
			FileWriter fout = new FileWriter(fname);
			System.out.println("Enter the singular and plural words seperated by spaces");
			Scanner sc = new Scanner(System.in);
			String fcont = sc.nextLine();
			//System.out.println(fcont);
			fout.write(fcont);*/
				ArrayList<String> allWords = new ArrayList<String>();
			
			Scanner input = new Scanner(new File("input.txt"));
			while (input.hasNext()) {
				String word = input.next();
				allWords.add(word);
				}
				System.out.println(allWords);
				System.out.println("List in Reverse order");
				 for (int i = allWords.size() - 1; i >= 0; i--) { 
		           System.out.print(allWords.get(i)+" ");
			        }
				System.out.println("\nList after removing plurals");
				 for (int i = 0; i < allWords.size(); i++) {
					 String word = allWords.get(i);
					 if (word.endsWith("s")) {
					 allWords.remove(i);
					 i--;
					 }
					 }
				 for (int i = allWords.size() - 1; i >= 0; i--) { 
			           System.out.print(allWords.get(i)+" ");
				        }
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}

