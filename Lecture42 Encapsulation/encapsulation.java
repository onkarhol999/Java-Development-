class myInfo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class encapsulation {
    public static void main(String[] args) {

        myInfo obj = new myInfo();
        obj.setName("Onkar");
        String name = obj.getName();
        obj.setAge(19);
        int age = obj.getAge();
        System.out.println(name + " : " + age);
    }
}
