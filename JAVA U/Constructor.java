class first
{
    first()
    {
      System.out.println("In default");
    }

    first (int a)
    {
       System.out.println("a="+a);
    }
    first(int a,int b)
    {
       System.out.println(a+ b);
    }
}
class Constructor
{
     public static void main(String args[])
{
    first f1=new first();
    first f2=new first(10);
    first f3=new first(10,20);
}
}