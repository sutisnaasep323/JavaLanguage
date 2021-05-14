package OOP.PZN;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // void = tidak mengembalikan data
    void sayHello(String nama){
        System.out.println("Hello " + nama + ", My name is " + name);
    }
}
