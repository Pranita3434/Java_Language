import java.util.*;
class paliwithoutRev
{
   public static void main(String args[])
   {
       String s1="madam";
       s1=s1.toLowerCase();
       int i=0;
       int j=s1.length()-1;
      
       for( ;i<s1.length()/2;i++,j--)
       {
           if(s1.charAt(i)!=s1.charAt(j))
           {
                System.out.println("NOT PALI");
                break;
           }
           if(i==s1.length())
            {
                System.out.println("PALI");
            }
       }
}
}