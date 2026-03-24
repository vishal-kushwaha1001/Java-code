class Shape {
    float areaOfCircle(float radius) {
        return 3.14f * radius * radius;
    }

    float areaOfRectangle(float length, float breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
    Shape shape = new Shape();
    float circleArea = shape.areaOfCircle(5.0f);
    System.out.println("Area of Circle: " + circleArea);
    float rectangleArea = shape.areaOfRectangle(4.0f, 6.0f);
    System.out.println("Area of Rectangle: " + rectangleArea);
    }
}