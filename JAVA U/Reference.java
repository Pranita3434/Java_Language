class abc
{
    int x=10;
    int y=20;
    void Share(abc Obj)
    {
        Obj.x++;
        Obj.y++;
    }
}
class Reference
{
    public static void main(String args[])
    {
        abc Obj = new abc(); 
        System.out.println(Obj.x);
        System.out.println(Obj.y);
        Obj.Share(Obj);
        System.out.println(Obj.x);
        System.out.println(Obj.y);
    }
}