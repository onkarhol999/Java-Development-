
class Student {
    int rollNumber;
    int marks;
    String name;
}

public class arrayUsingObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Onkar";
        s1.rollNumber = 64;
        s1.marks = 98;
        Student s2 = new Student();
        s2.name = "Prajwal";
        s2.rollNumber = 54;
        s2.marks = 95;
        Student s3 = new Student();
        s3.name = "Priya";
        s3.rollNumber = 14;
        s3.marks = 99;
        Student s4 = new Student();
        s4.name = "Abhi";
        s4.rollNumber = 34;
        s4.marks = 88;

        Student info[] = new Student[4];
        info[0] = s1;
        info[1] = s2;
        info[2] = s3;
        info[3] = s4;

        for (Student n : info) {
            System.out.println(n.name + " : " + n.marks);
        }
    }
}
