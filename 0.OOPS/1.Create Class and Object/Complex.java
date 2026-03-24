class Complex {
    int real;
    float imaginary;
    Complex() {
    real = 0;
    imaginary = 0;
    }
    Complex(int r, float i) {
    real = r;
    imaginary = i;
    }
    Complex(Complex c) {
    real = c.real;
    imaginary = c.imaginary;
    }
    void display() {
    System.out.println(real + " + " + imaginary + "i");
    }
    public static void main(String[] args) {
    Complex c1 = new Complex();
    c1.display();
    Complex c2 = new Complex(5, 7.3f);
    c2.display();
    Complex c3 = new Complex(c2);
    c3.display(); }
   }
