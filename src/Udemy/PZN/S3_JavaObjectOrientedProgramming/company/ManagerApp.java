package Udemy.PZN.S3_JavaObjectOrientedProgramming.company;

public class ManagerApp {

    public static void main(String[] args) {
        var manager = new Manager("Asep");
        manager.sayHello("Yumi");

        var vp = new VicePresident("Asep", "PZN", 20);
        vp.sayHello("Yumi");
    }

}
