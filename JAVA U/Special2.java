/* write a program to find given no is speoial or not as per require
2025=20   25    ==45==2025
while(n0<0)

{  no=no/10;
   digit++;
}
*/
class Special2
{
   public static void main(String args[])
   {
          int no=2025;
          String s1= no+"";
          int len=s1.length();
          if(len%2==1)
          {
             System.out.println("invalid");
          }
          else
          {
             String p1=s1.substring(0,len/2);
             String p2=s1.substring(len/2,len);

             int a=Integer.parseInt(p1);
             int b=Integer.parseInt(p2);
             int c=a+b;
             c=c*c;
             if(no==c)
                  System.out.println("special");
             else
                  System.out.println("not");
   }
}
}
         

  