
class SortSingle
{
    public static void main(String[] args) 
    {
        int a[]={12,7,2,19,21,13};
        int i;
        int j;
        for(i=0,j=i+1;i<a.length && j<a.length;)
        {
            if(a[i]>a[j])
            {
                int temp=a[j];
                a[i]=a[j];
                a[j]=temp;
                  j=i+1; 
                  i=0;
            }
            else
            {
                i++;
                j++;
            }
            
        
        }
          for(i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}