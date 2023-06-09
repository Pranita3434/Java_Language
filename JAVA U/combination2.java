/*wap to display maximum value among all digit combination of given number??
(input 786): 678,687,768,786,876,867 (output: 198)     extra diff between lowest nd higest*/
876-678=198

import java.util.Arrays;

class combination2 {
   public static void main(String args[]) 
     {
            int no=786;
            int total=0;
            int temp=no;


            while(no>0)
            {
               no=no/10;
               total++;
            }
           
            no=temp;
            int a[]=new int[total];
            int i=0;
          
            while(no>0)
            {
                int digit=no%10;
                a[i]=digit;
                i++;
                no=no/10;
            }
            Arrays.sort(a);
             int ans=0;
             int ans1=0;
            for(i=a.length-1;i>=0;i--)
            {
                 ans=(ans*10)+a[i];
            }
               System.out.println(ans); 

             
            for(i = 0; i < a.length; i++)   
            {
                 ans1=(ans1*10)+a[i];
            }
               System.out.println(ans1);
             
            int difference = ans - ans1;
            System.out.println("difference:"+ difference);
      
 
            
     }
}

/*
 * int ans=0;
 * for(i=a.length-1;i>=0;i--)
 * {
 * ans=(ans*10)+a[i];
 * }
 * System.out.println(ans);
 * for(i=a.length-1;i>=0;i--)
 * System.out.println(a[i]);
 * 
 */
