//1.  Implement a Class with Encapsulation 
// Write a Java program that demonstrates encapsulation. Create a class with private variables and use getter and setter methods to modify and access them.

class data {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class first {
    public static void main(String[] args) {
        data obj = new data();
        obj.setId(15);
        int id = obj.getId();
        obj.setName("Onkar");
        String name = obj.getName();

        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}
