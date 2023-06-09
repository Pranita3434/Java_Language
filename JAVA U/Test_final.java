class first {
    final void show() {
        System.out.println("In first");
    }
}

class second extends first {
    void show() {
        System.out.println("In second");
    }
}

class Test_final {
    public static void main(String args[]) {
        second s2 = new second();
        s2.show();
    }
}
/*
 * beacuse offinal keyword erroeis their if reomve final than it work properly
 */