class fibo1
{
      public static void main(String args[])
      {
          int total=9;
          int i;
          int f1=1;
          int f2=1;
          int f3=f1+f2;

          System.out.println(f1+" "+f2);
 
          for(i=2;i<total;i++)
          {
              System.out.println(" "+f3);
              f1=f2;
              f2=f3;
              f3=f1+f2;
          }
       }
}
