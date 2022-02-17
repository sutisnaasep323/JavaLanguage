package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class Manager {

    String name;
    String company;
    int age;

    Manager (String name){
        this.name = name;
    }

    Manager (String name, String company, int age){
        this.name = name;
        this.company = company;
        this.age = age;
    }

    void sayHello (String name){
        System.out.println("Hai " + name + " Saya Manager " + this.name);
    }

}
