import java.io.*;
class BR2
{
     public static void main(String args[])throws Exception
     {
          InputStreamReader r=new InputStreamReader(System.in);    
          BufferedReader br=new BufferedReader(r);  

          System.out.println("Enter 1st Number:");
          String s1=br.readLine();
          System.out.println("Enter 2nd Number:");
          String s2=br.readLine();
          int a=Integer.parseInt(s1);
          int b=Integer.parseInt(s2);
          int c=a+b;
          System.out.println("ADD==>"+c);
         
     }
}
  