package module3;
import java.io.*;
public class FileAdd {
	public static void main(String arg[]) throws IOException
	{
	try
	{
	String s="Smitha Jacob is Your Java Teacher";
	FileWriter f = new FileWriter("smith.txt");
    f.write(s+"\nAll the Best");
    f.close();
    	System.out.println("Written to file smith.txt");
	}
	catch(FileNotFoundException e)
	{
	System.out.println("File not found");
	return;
	}
	
	} 
}
