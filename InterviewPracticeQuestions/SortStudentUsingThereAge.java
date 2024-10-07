import java.util.*;;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class SortStudentUsingThereAge {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return Integer.compare(i.age, j.age);
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(12, "Onkar"));
        studs.add(new Student(15, "Raj"));
        studs.add(new Student(9, "Ram"));
        studs.add(new Student(3, "Shiv"));
        studs.add(new Student(21, "Ramu"));

        for (Student stu : studs) {
            System.out.println(stu);
        }
    }
}
