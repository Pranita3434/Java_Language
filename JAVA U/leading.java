class leading
public static void main(String args[])
	{
	    int a[]={12,0,6,0,8,14,0,17};
	    int b[]= new int[a.length];
	    int j=0;

	    for(int i=0;i<a.length;i++)
	    { 
	        int no=a[i];

	        if(no!=0)
	        {
	          b[j]=no;
	          j++;
	        }
        }
	        while(j<b.length)
	        {
	        	b[j]=0;
	        	j++;
	        }

	        for(j=0;j<b.length;j++)
                System.out.println(b[j])

	}
