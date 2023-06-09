interface abc 
{
     void show();
     void fun();
}

class xyz implements abc
{
     public void show()
     {
         System.out.println("In show");
     }

     public void fun() 
     {
          System.out.println("In fun");
     }
}

class Test 
{
     public static void main(String args[]) 
     {
          xyz obj = new xyz();
          obj.show();
          obj.fun();
     }
}