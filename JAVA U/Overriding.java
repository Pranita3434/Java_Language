class A
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
}
class B extends A
{
    void add(float a,float b)
    {
       
      float c=a+b;
      System.out.println("c="+c);
}
}
 class Overriding
{
     public static void main(String args[])
    {
       B obj=new B();
       obj.add(25,5);
       obj.add(7.2f,2.7f);

}  
}
