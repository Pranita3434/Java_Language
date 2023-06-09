class display2 extends Thread
{
   int id;
   public void run()
   {
     if(id==1)
     {
        for(int i=1;i<=100;i++)
           if(i%2==0)
           System.out.println("Even="+i);
     }
     else
       if(id==2)
       {
           for(int j=100;j<=200;j++)
           if(j%2==1)
           System.out.println("\tOdd="+j);
        }
    }
}
  