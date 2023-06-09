/* wap to accept a name form user and display it char by char with delay of 500 msec*/

import java.util.*;
class Display_Name_delay
{
   public static void main(String args[])throws Exception
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Name=");
     String s1=sc.next();
     for(int i=0;i<s1.length();i++)
     { 
        char ch=s1.charAt(i);
        System.out.print(ch);
        Thread.sleep(500);
     }
}
}