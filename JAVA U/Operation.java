import java.util.*;

class Operation {
    public static void main(String args[]) {
        int no = 0;
        Scanner sc = new Scanner(System.in);

        L1: while (true) {
            System.out.println("Enter No:");
            no = sc.nextInt();
            if (no > 0)
                continue L1;
            else if (no == 0) {
                System.out.println("BYE");
                break;
            } else
                break;
        }
    }

}
