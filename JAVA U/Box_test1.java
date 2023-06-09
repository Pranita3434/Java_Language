import java.util.*;

class Box {
    int width;
    int depth;
    int height;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height,width and depth==>");
        height = sc.nextInt();
        width = sc.nextInt();
        depth = sc.nextInt();
    }

    int area() {
        int v = height * depth * width;
        return v;
    }
}

class Box_test1 {
    public static void main(String args[]) {
        Box b1 = new Box();
        b1.get();
        int v = b1.area();
        System.out.println("Value=" + v);
    }
}
