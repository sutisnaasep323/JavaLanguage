package OOP.PZN;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Asep";
        manager.sayHello("Joni");

        VicePresident vp = new VicePresident();
        vp.name = "Hammad";
        vp.sayHello("Jono");
    }
}
