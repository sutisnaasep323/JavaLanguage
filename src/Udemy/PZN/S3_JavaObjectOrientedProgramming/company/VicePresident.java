package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class VicePresident extends Manager{

    // methode overriding, membuat ulang method. return, nama function, dan parameter harus sama
    void sayHello(String namee){
        System.out.println("Hai " + namee + " Saya VP " + this.name);
    }
}
