class DigitMax {
    public static void main(String[] args) {
        int a[] = { 21, 78, 94, 65, 82 };
        int add = 0;
        int no = 0;

        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }
            if (sum > add) {
                add = sum;
                no = a[i];
            }
        }
        System.out.println(no);
    }
}