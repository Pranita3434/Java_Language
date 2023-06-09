class first
{
    
       first(int a)
       {
          int x=a;
}
}
class second extends first
{
     
       second(int a,int b)
       {
            super(a);
            int y=b;
        }
}
class Super_method
{
       public static void main(String args[])
       {
           second s2=new second(10,20);
           System.out.println(s2.x);
           System.out.println(s2.y);
       }
}