package module3;
//Import the File class
import java.io.File;




import java.io.*;
public class FEx4
{ public static void main(String[] args) throws IOException 
    { 
	try { 
   FileOutputStream  fout = new FileOutputStream("test.txt",true);
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
   System.out.println("enter data");
   String s=br.readLine();
   byte[] arr = s.getBytes();
   fout.write(arr);
      System.out.println("data added");
   
	}
	catch (Exception e) 
	{
	System.out.println("File Not Found");
	} }
}