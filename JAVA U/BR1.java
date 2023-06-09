import java.io.*;
class BR1
{
     public static void main(String args[])throws Exception
     {
          InputStreamReader r=new InputStreamReader(System.in);    
          BufferedReader br=new BufferedReader(r);  

          System.out.println("Enter Name:");
          String n1=br.readLine();
          System.out.printclsln("Name="+n1);
     }
}
         