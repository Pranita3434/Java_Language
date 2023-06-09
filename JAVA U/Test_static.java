class demo
{
    int x=10;
    static int y = 20;
}
class Test_static
{ 
    public static void main(String args[])
    {
          int x=90;
          demo d1=new demo();
          System.out.println(d1.x);
          System.out.println(d1.y);
          System.out.println(demo.y);
    }
}