/*WAp to source file name from user and destination file name from user and trnsfer content (file transfer program copy and paste)with the time facotr. 

sliding window protocol.....
WAP to read all the numbers all the numbers form the source file each number on separte line and write their addition in the another file
*/


import java.io.*;
import java.util.*;
public class File_N
{
      public static void main(String args[])throws IOException
{

      String fname,dname;
      int sum=0;
      BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
       System.out.println("\nEnter Input File");
       fname=in.readLine();
       
       System.out.println("\nEnter Output File");
       dname=in.readLine();
       
       DataInputStream input =new DataInputStream(new FileInputStream(fname));
       DataOutputStream output =new DataOutputStream(new FileOutputStream(dname));

        while(true)
        {
            String n1=input.readLine();
        
            if(n1==null)
              break;
  
            sum+=Integer.parseInt(n1);
        }

        output.writeBytes(Integer.toString(sum));
      
         System.out.println("/nAddition Done ||");
 
         input.close();
         input.close();
     }
}

         




















      