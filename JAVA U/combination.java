/*wap to display maximum value among all digit combination of given number??
(input 786): 678,687,768,786,876,867 (output: 876)     extra diff between lowest nd higest*/

import java.util.Arrays;
class combination
 {
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
            for(i=a.length-1;i>=0;i--)
            {
                 ans=(ans*10)+a[i];
            }
               System.out.println(ans); 
             
      
 
            
     }
  }
            
 /*
   int ans=0;
   for(i=a.length-1;i>=0;i--)
   {
       ans=(ans*10)+a[i];
   }
               System.out.println(ans); 
for(i=a.length-1;i>=0;i--)
               System.out.println(a[i]); 
             
*/
       

