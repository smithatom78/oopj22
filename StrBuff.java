package module4;
public class StrBuff 
{
public static void main(String args[]){  
StringBuffer sb=new StringBuffer();  
System.out.println("Default capacity ="+sb.capacity());//default 16  
sb.append("Hello");  
System.out.println("Present String="+sb);
System.out.println("Present capacity after Append ="+sb.capacity());//now 16  
sb.append(" java is my favourite language"); 
System.out.println("The String changed="+sb);
System.out.println("Present Length after Append= "+sb.length());
System.out.println("Modified String after Append= "+sb);
System.out.println("Present capacity after Append= "+sb.capacity());
//now (16*2)+2=34 i.e (oldcapacity*2)+2  
sb.ensureCapacity(50);//now (34*2)+2  
System.out.println("Present capacity after Ensurecapacity ="+sb.capacity());//now 70  
}  
}