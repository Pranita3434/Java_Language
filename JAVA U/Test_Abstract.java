abstract class first {
     void add(int a, int b) {
          int c = a + b;
          System.out.println(c);
     }

     abstract void sub(int a, int b);
}

class second extends first {
     void sub(int a, int b) {
          int c = a - b;
          System.out.println(c);
     }
}

class Test_Abstract {
     public static void main(String args[]) {
          first s2 = new second();
          s2.add(10, 20);
          s2.sub(50, 30);
     }
}
