package OOP.PZN;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //Membuat Constructor
    Person (String name, String address){
        // this ini mengambil field/attribut objek diatas. digunakan agar tidak terjadi shadowing
        this.name = name;
        this.address = address;
    }

    Person (String paramName){
//        name = paramName;
        this(paramName, null); // -> Memanggil constructor lain. seolah-olah contsructor kedua ini itu memanggil constructor pertama, hanya parameter kedua di null kan
    }

    Person (){
        this(null);
    }

    // void = tidak mengembalikan data
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
