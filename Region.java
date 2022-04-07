package module4;

import java.io.*;
public class Region {

   public static void main(String args[]) {
      String Str1 = new String("Welcome to JavaDevelopers World");
      String Str2 = new String("Javat");
      String Str3 = new String("JAVA");
      System.out.print("Return Value :" );
      System.out.println(Str1.regionMatches(11, Str2, 0, 5));
      System.out.print("Return Value :" );
      System.out.println(Str1.regionMatches(11, Str2, 0, 4));
      System.out.print("Return Value :" );
      System.out.println(Str1.regionMatches(11, Str3, 0, 4));
   }
}