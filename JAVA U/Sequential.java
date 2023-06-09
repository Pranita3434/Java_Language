class first
{
       int x;
       first(int a)
       {
          x=a;
}
}
class second extends first
{
       int y;
       second(int a,int b)
       {
            super(a);
            y=b;
        }
}
class third extends second
{
       int z;
       third(int a,int b,int c)
       {
            super(a,b);
            z=c;
        }
}
class Sequential 
{
       public static void main(String args[])
       {
           third t3=new third(10,20,30);
           System.out.println(t3.x);
           System.out.println(t3.y);
           System.out.println(t3.z);
       }
}