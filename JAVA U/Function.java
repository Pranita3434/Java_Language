class Function
{
     public static void main(String args[])
     {
            int x=10;
            final int y=20;
            System.out.println(x);
            System.out.println(y);
            x=30;
            y=40;                      //error bcze final keyword
            System.out.println(x);
            System.out.println(y);
     }
}