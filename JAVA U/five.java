/*
WAP to consrtuct a package number and find
1 Prime 
2 Reverse 
3 special mul add same
4 amrstrong 
5 didgit sorted numb
*/

package number;

public class Display5 {
    public static void prime(int num) {

        for (int i = 0; i <= n; i++) {
            int n = i;
            int div = 0;
            for (int j = 2; j <= n / 2; j++)
                if (n % j == 0)
                    div++;
            if (div == 0) {
                System.out.println("IT Is Prime number =" + n);
            }
        }
        System.out.println("\n");
    }

    public static void reverse(int num) {
        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;

        }
        System.out.println("Answer=" + rev);
    }

    public static void mul_add_special(int num) {
        String s1 = num + "";
        int len = s1.length();
        if (len % 2 == 1) {
            System.out.println("invalid");
        } else {
            String p1 = s1.substring(0, len / 2);
            String p2 = s1.substring(len / 2, len);

            int a = Integer.parseInt(p1);
            int b = Integer.parseInt(p2);
            int c = a + b;
            c = c * c;
            if (num == c)
                System.out.println("special");
        }

    }

    public static void arm(int num) {

        String s1 = num + "";
        int len = s1.length();
        int sum = 0;
        int temp = no;

        while (num > 0) {
            int digit = no % 10;
            sum += Math.pow(digit, len);
            num = num / 10;
        }
        if (sum == temp)
            System.out.println("Arm");

    }

    public static void digt_sort(int num) {
        String s1 = num + "";
        int len = s1.length();
        Arrays.sort(len);
        String s2 = new String(ch);
        System.out.println(s2);

    }
}
