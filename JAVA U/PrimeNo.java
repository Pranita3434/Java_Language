class PrimeNo {
    public static void main(String[] args) {
        int a[]={7,12,13,17,21};
        
        for(int i=0;i<a.length;i++)
        {
            int n=a[i];
            int div=0;
            for(int j=2;j<n/2;j++)
            {
                if(n%j==0)
                    div++;
                if(div==1)
                   break;
             }
           if(div==0)
           System.out.println(n);
        }
    }
}