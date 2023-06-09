import java.util.*;
class Excpt_try_catch_catch
{
    public static void main(String args[])
    {
      int a[]={10,20,30};
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter index");
      int i=sc.nextInt();
      System.out.println("Enter X and Y");
      int x=sc.nextInt();
      int y=sc.nextInt();

      try
      {
         System.out.println(a[i]);
         System.out.println(x/y);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
         System.out.println("Invalid X index");
       }
       catch(ArithmeticException ez)
       {
         System.out.println("Invalid  Y value");
       }

    }
}  
