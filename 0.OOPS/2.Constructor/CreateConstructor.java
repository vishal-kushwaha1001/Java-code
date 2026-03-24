class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

}

public class CreateConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(62, "vishal");
        System.out.println(s1.name + s1.rollNo);
    }

}