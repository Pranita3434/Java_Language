import java.util.*;

class Array_program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");

        int no = sc.nextInt();
        String s1 = no + " ";
        int len = s1.length();
        String p1 = s1.substring(0, len / 2);
        String p2 = s1.substring(len / 2, len);
        char ch1[] = p1.toCharArray();
        char ch2[] = p1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s2 = " ";
        for (int i = 0; i < ch1.length; i++)
            s2 = s2 + ch1[i];

        for (int j = 0; j < ch2.length; j++)
            s2 = s2 + ch2[j];

    }
}