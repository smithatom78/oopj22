package module2;

public class Holiday {
 String name;
 int day;
String month;
// your code goes here
Holiday(String name,int day,String month)
{
	this.name=name;
	this.day=day;
	this.month=month;
}
boolean isSameMonth(String s1,String s2)
{boolean flag;
	
	if (s1.equals(s2))
		flag=true;
	else
		flag=false;
return flag;
}
public static void main(String args[]) {
	
	Holiday ob1=new Holiday("Christmas",25,"December");
	Holiday ob2=new Holiday("ABC",20,"december");
	String s1=(ob1.month).toLowerCase();
	String s2=(ob2.month).toLowerCase();
	boolean f=ob1.isSameMonth(s1,s2);
	if(f)
	{
	System.out.println(ob1.name+" is on "+ob1.day+"th day of the month "+ob1.month);	
		
	}
	else
	{System.out.println(" holiday month is not matching");
		
	}
	Holiday ob3=new Holiday("Independence day",4,"July");
	System.out.println(ob3.name+" is on "+ob3.day+"th day of the month "+ob3.month);	
	
}	
}
