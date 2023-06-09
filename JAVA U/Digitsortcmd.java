import java.util.*;
class Digitsortcmd
{
     public static void main(String args[])
     {
        String s1=args[0];
        char ch[]=s1.toCharArray();
        Arrays.sort(ch);
        String s2=new String(ch);
        System.out.println(s2);
     }
}
    