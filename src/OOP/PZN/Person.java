package OOP.PZN;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //Membuat Constructor
    Person (String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person (String paramName){
//        name = paramName;
        this(paramName, null); // -> Memanggil constructor lain. seolah-olah contsructor kedua ini itu memanggil constructor pertama, hanya parameter kedua di null kan
    }

    Person (){
        this(null);
    }

    // void = tidak mengembalikan data
    void sayHello(String nama){
        System.out.println("Hello " + nama + ", My name is " + name);
    }
}
