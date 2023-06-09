interface abc {
     void Show();

     void Fun();
}

class xyz implements abc {
     public void Show() {
          System.out.println("In show");
     }

     public void Fun() {
          System.out.println("In fun");
     }
}

class Interface {
     public static void main(String args[]) {
          xyz obj = new xyz();
          obj.Show();
          obj.Fun();
     }
}