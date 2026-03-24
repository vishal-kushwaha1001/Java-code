class A{
    A(){
        int a = 5, b = 4;
        System.out.println(a+b);
    }
}

class B extends A{
    B(){
        int a = 6, b = 8;
        System.out.println(a+b);
    }
}

public class New {
    public static void main(String[] args) {
        B b1 = new B();
    }
}
