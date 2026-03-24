class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class Overloding{
    public static void main(String[] args) {
    Calculator solve = new Calculator();
    System.out.println("Addition of 10 and 20: " + solve.add(30, 40));
    System.out.println("Addition of 10, 20 and 30: " + solve.add(4, 8, 16));
    System.out.println("Addition of 5.5 and 6.7: " + solve.add(4.98, 3.77));
    }
}
