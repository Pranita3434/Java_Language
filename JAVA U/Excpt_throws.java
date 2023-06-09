import java.util.*;
class Excpt_throws extends Exception
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter age");
      int a=sc.nextInt();
      try
      {
         if(a<=0)
            throw new Excpt_throws();
         else 
            System.out.println("Valid Age");
       }
       catch(Excpt_throws e1)
       {
         System.out.println("Invalid age");
       }
    }
}  
