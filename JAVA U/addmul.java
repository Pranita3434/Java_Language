class addmul 
{
  public static void main(String args[])
 {
    int no = 123;
    int sum = 0;
    int mul = 1;

    while (no > 0) 
   {
      int digit = no % 10;
      sum = digit + sum;
      mul = digit * mul;
      no = no / 10;

   }
   if(sum==mul)
      System.out.println("Special");
   else
      System.out.println("Not Special");

  }
}
