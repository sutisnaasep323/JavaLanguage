package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class Manager extends Employee{

    String company;
    int age;

    Manager (String name){
        super(name);
    }

    Manager (String name, String company, int age){
        super(name);
        this.company = company;
        this.age = age;
    }

    void sayHello (String name){
        System.out.println("Hai " + name + " Saya Manager " + this.name);
    }

}
