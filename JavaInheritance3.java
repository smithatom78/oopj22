package module2;
class Ant
{Ant(){}
  Ant(String name)
  {
    System.out.print("Inside Ant(String) Constructor. ");
  }
}
class WildAnt extends Ant
{
  WildAnt()
  {
    System.out.print("Inside WildAnt() Constructor. ");
  }
}

public class JavaInheritance3
{
  public static void main(String[] args)
  {
    WildAnt wa = new WildAnt();
  }
}
