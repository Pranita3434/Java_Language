class addmul2 
{
  public static void main(String args[])
 {
    
    int N=15;
    int no=1;

    while(N>0)
   {
      int sum = 0;
      int mul = 1;
      int temp = no;
      
      while(no>0)
      {
         int digit = no % 10;
         sum = digit + sum;
         mul = digit * mul;
         no = no / 10;
 
      }
   
   if(sum==mul)
   {
     System.out.println("special="+temp);
     N--;
   }
   no=temp;
   no++;
   }
 }
}
   
