package series;

public class Display {
    public static void show(int limit) {
        int f1 = 1;
        int f2 = 1;
        int f3 = f1 + f2;

        System.out.println(f1 + " " + f2);

        for (int i = 2; i < limit; i++) {
            System.out.println(" " + f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}