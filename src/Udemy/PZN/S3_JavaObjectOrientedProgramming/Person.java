package Udemy.PZN.S3_JavaObjectOrientedProgramming;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //menambahkan method
    void sayHello(String nama){
        System.out.println("Hello " + nama + " Nama saya " + name + " dari " + address);
    }

    //menambahkan constructor, constructor adalah method yang dipanggil pertama kali ketika object dibuat
    // tujuannya agar wajib memberikan sebuah argumen untuk parameter tersebut
    Person(String paramNama, String paramAdress){
        name = paramNama;
        address = paramAdress;
    }

}
