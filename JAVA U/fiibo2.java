class fiibo2
{
      public static void main(String args[])
      {
          
          
          int total=10;
          
 
          //for(int pos=1;pos<=total;pos++)
          {
              int val=fibo(8);
              System.out.println(val+" ");
              
          }
       }
       public static int fibo(int pos)
       {
           if(pos==1||pos==2)
             return 1;
           else
             return fibo(pos-1)+fibo(pos-2);
       }
}
