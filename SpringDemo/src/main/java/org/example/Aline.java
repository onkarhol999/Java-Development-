package org.example;

public class Aline {
     private  int age ;
     private  Computer com;
     public  Aline(){
         System.out.println("Geter Seter in Aline");
     }
//     public  Aline(int age){
//         this.age = age;
//     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void show(){
        System.out.println("Coding.....");
        com.compile();
    }

}
