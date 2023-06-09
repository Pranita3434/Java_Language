package symbol;

public class Display1 {
   public static void show(int line) {
      char ch[] = { '*', '@', '#', '^', '!', '$' };
      for (int i = 0; i < line; i++) {
         for (int j = 0; j < line - 1; j++) {
            System.out.println(" ");
         }
         for (int k = 0; k <= i; k++) {
            System.out.println(ch[k] + " ");
         }
      }

      System.out.println("\n");
   }
}