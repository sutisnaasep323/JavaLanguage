package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void sayHello (String name){
        System.out.println("Hai " + name + " Saya Manager " + this.name);
    }
}
