package PZN;

public class Method {
    public static void main(String[] args) {
        Method helo = new Method();
        helo.sayHello("Asep");

        sayHelloWorld();
        sayHelloWorld();

    }

    static void sayHelloWorld(){
        System.out.println("Hello 1");
        System.out.println("Hello 2");
    }


    void sayHello(String name){
        System.out.println("Hello my name is " + name);
    }


}
