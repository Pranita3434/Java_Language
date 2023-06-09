/*WAP to find a prime num between 1 to 500 and special number between 500 to 2000
*/

class display4 implements Runnable {
   int id;

   public void run() {
      if (id == 1) {
         for (int i = 0; i <= 500; i++) {
            int n = i;
            int div = 0;
            for (int j = 2; j <= n / 2; j++)
               if (n % j == 0)
                  div++;
            if (div == 0) {
               System.out.println("Prime=" + n);
            }
         }
      } else if (id == 2) {
         for (int k = 500; k <= 2000; k++) {
            int n = k;
            int add = 0, mul = 1;
            while (n > 0) {
               int digit = n % 10;
               add = add + digit;
               mul = mul * digit;
               n = n / 10;
            }
            if (add == mul)
               System.out.println("\tSpecial=" + k);
         }
      }
   }
}
