class A {
      void show() {
            System.out.println("In show");
      }
}

interface B {
      void disp();
}

interface C {
      void fun();
}

class D extends A implements B, C {
      public void disp() {
            System.out.println("In disp");
      }

      public void fun() {
            System.out.println("In fun");
      }
}

class Test1 {
      public static void main(String args[]) {
            D obj = new D();
            obj.fun();
            obj.show();
            obj.disp();
      }
}
