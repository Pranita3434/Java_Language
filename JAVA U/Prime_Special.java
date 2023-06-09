class Prime_Special
{
 public static void main(String args[])
   {
      display4 d1=new display4();
      display4 d2=new display4();
      Thread t1=new Thread(d1);
      Thread t2=new Thread(d2);
      d1.id=1;
      d2.id=2;
      t1.start();
      t2.start();
    }
}