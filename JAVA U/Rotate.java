/*compare
String s1="program";
 val=2     
output   clockwise===amprogr
         anticlockwise===ogrampr

*/

class Rotate
{
   public static void main(String args[])
   {
       String s1="program";
       int val=2;
       int len=s1.length();
       String p1=s1.substring(0,len-val);
       String p2=s1.substring(len-val,len);
       String clock=p1+p2;
       System.out.println(clock);
       String p3=s1.substring(0,val);
       String p4=s1.substring(val,len);
       String anti=p4+p3;
       System.out.println(clock);
}
}

 
