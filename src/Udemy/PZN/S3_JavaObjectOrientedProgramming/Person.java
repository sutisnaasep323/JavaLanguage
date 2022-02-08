package Udemy.PZN.S3_JavaObjectOrientedProgramming;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //menambahkan method
    void sayHello(String nama){
        String loc = address != null? address : "Alamat belum di set";
        System.out.println("Hello " + nama + " Nama saya " + name + " dari " + loc);
    }

    //menambahkan constructor, constructor adalah method yang dipanggil pertama kali ketika object dibuat
    // tujuannya agar wajib memberikan sebuah argumen untuk parameter tersebut
    Person(String name, String address){
        this.name = name; // -> this = solusi dari shadowing
        this.address = address;
    }

    //constructor overloading
    Person(String paramNama2){
//        name = paramNama2;
        this(paramNama2, null); // -> Memanggil dari constructor lain
    }

    Person(){
        this(null);
    }

}
