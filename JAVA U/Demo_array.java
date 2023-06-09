class Demo_array
{
   public static void main(String args[])
   {
        int a[][]={{6,8,12,19},{21,7,8,9},{1,3,4,6},{54,11,23,2}};
        int b[][]={{1,2,12,6},{2,6,5,1},{15,1,21,16},{5,1,24,4}};

        for(int r=0;r<4;r++)
        {
            for(int c=0;c<4;c++)
            {
               System.out.println((a[r][c]+b[r][c])+" ");
            }
            System.out.println("\n");
         }
}
}