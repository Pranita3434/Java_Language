class TestBox {
   public static void main(string args[]) {
      Scanner sc = new scanner(System.in);
      System.Out.pritnln("Enter How many boxes=");
      int n = sc.nextInt();
      int max = 0;
      Box b[] = new Box();
      for (int i = 0; i < n; i++) {
         b[i] = new Box();
         b[i].get();
         int v = b[i].area();
         if (max < v)
            max = v;
      }
   }
}
