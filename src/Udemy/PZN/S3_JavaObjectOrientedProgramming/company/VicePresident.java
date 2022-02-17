package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class VicePresident extends Manager{

    VicePresident(String name, String company, int age){
        super(name, company, age);
    }

    // methode overriding, membuat ulang method. return, nama function, dan parameter harus sama
    void sayHello(String name){
        //this untuk mengakses class di parentnya
        System.out.println("Hai " + name + " Saya VP " + this.name + " my Company " + this.company);
    }
}
