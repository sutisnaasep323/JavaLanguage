package Udemy.PZN.S3_JavaObjectOrientedProgramming;

public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Yummi", "Nagrak");

//        person1.name = "Yummi"; -> dihapus karena kita langsung tulis di constructor
//        person1.address = "Nagrak";

        // person1.country = "Japan" -> Error karena field/property FINAL

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person("Asep", "Bogor");
//        person2.name = "Asep";
        person2.sayHello("Hammad");
        person2.myClass("Doni", "R19");

        Person person3;
        person3 = new Person("Hammad");
        person3.sayHello("Roby");

    }
}
