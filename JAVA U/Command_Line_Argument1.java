import java.util.*;
class Command_Line_Argument1
{
     public static void main(String args[])
     {
       Arrays.sort(args);
       for(int i=0;i<args.length;i++)  
           System.out.println("Name="+args[i]);
       }
}
       