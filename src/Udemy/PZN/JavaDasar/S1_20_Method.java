package Udemy.PZN.JavaDasar;


import Udemy.PZN.JavaDasar.S1_20_Method;

public class S1_20_Method {
    public static void main(String[] args) {
        S1_20_Method helo = new S1_20_Method();
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
