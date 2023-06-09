
import java.util.*;

class Ifoperation {
    public static void main(String[] args) {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        L1: while (true) {
            System.out.print("Enter No:");
            no = sc.nextInt();
            if (no > 0)
                continue L1;
            else if (no == 0 || no < 0) {
                if (no == 0)
                    System.out.print("Bye");
                break;
            }

        }

    }
}