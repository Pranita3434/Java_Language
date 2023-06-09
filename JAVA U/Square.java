class Square {
    public static void main(String[] args) 
    {
        int i,n=9,sum=0;
       
        System.out.println("The square natural upto %d terms are :");
        for(i=1;i<=n;i++)
        {
            System.out.println(i*i + " ");
            sum+=i*i;
        }
    }
}