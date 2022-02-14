package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class ManagerApp {

    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Asep";
        manager.sayHello("Yumi");

        var vp = new VicePresident();
        vp.name = "Asep";
        vp.sayHello("Yumi");
    }

}
