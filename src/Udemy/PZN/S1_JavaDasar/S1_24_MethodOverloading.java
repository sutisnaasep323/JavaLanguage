package Udemy.PZN.S1_JavaDasar;

public class S1_24_MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Asep");
        sayHello("Asep", "Sutisna");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String name, String lastName){
        System.out.println("Hello " + name + " " + lastName);
    }
}
