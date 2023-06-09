import number.*;
import java.util.*;

class Outer_five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUM");
        int num = sc.nextInt();
        Display5.prime(num);
        Display5.reverse(num);
        Display5.mul_add_special(num);
        Display5.arm(num);

    }
}