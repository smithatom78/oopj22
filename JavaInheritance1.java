package module2;
class Sweet
{
  void price()
  {
    System.out.print("Sweet=$10 ");
  }
}
class Sugar extends Sweet
{
  void price()
  {
    super.price();
    System.out.print("Sugar=$20");
  }
}
public class JavaInheritance1
{
  public static void main(String[] args)
  {
    Sugar su = new Sugar();
    su.price();
  }
}