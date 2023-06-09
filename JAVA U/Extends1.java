class A
{
   int x=10;
}
class B extends A
{
   int y=20;
}
class Extends1
{
    public static void main(String args[])
    {
        B obj=new B();
        System.out.println(obj.x);
        System.out.println(obj.y);
     }
}