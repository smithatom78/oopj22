package module2;
abstract class Shape1 {
abstract void numberofSides();
}

class Rectangle1 extends Shape1
{
	void numberofSides()
	{
System.out.println("I am Rectangle, I have 4 sides");
}

}

class Triangle1 extends Shape1 
{
	void numberofSides()
	{
System.out.println("I am Triangle, I have 3 sides");
 }

}

class Hexagon1 extends Shape1 
{ 
	void numberofSides()
	{
System.out.println("I am Hexagon, I have 6 sides");

}

}

public class Poly{

public static void main(String[] args)
{ 
Rectangle1 r=new Rectangle1();
Triangle1 t=new Triangle1(); 
Hexagon1 h=new Hexagon1();
r.numberofSides();
t.numberofSides();
h.numberofSides();
}

}
