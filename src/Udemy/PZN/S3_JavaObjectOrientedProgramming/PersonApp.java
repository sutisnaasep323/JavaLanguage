package Udemy.PZN.S3_JavaObjectOrientedProgramming;

public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Yummi";
        person1.address = "Nagrak";
        // person1.country = "Japan" -> Error karena field FINAL

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();
        Person person3;
        person3 = new Person();

    }
}
