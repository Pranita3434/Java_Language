class abc
{
     int x=10;
}
class Garbage
{
    public static void main(String args[])
    {
         abc obj1=new abc();
         System.out.println(obj1.x);
         obj1=null;
         System.gc();  /*yamde obj1 null zala mnje ch to rikama aahe kva gelay tya mule aapn obj2 chi value tya jagevr taku shkto tya mule ya program la fkt 4byte memory lagnar  aani jr [System.gc()] nst takl tr 8byte lagle aste obj1 la 4 and obj 2 la 4byte......aani jr aapn obj1 kadhly aani tri pn tyala access krayla gelo tr tithe error yenar null pointer exception error SOp(obj1.x) */       

         abc obj2=new abc();
         obj2.x++;
         System.out.println(obj2.x);
   }
}
     
     