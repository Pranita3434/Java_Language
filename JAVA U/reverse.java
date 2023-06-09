class reverse
{
  public static void main(String args[])
  
  {
       int no=786;
       int rev=0;
       

       while(no>0)
       {
           int digit =no%10;
           rev = (rev*10)+ digit;
           no=no/10;

       }
       System.out.println("Answer="+rev);
   }
}