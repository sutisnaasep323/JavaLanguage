package OOP.PZN;

public class PersonApp {

    public static void main(String[] args) {
        //Pembuatan Objek
        //1
        Person person1 = new Person();
        person1.name = "Abu Hammad";
        person1.address = "Nagrak";
        //person1.country = "Saudi Arabia"; // Akan ERROR karena field nya sudah FINAL. kita hanya bisa panggil

            //Pemanggilan
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //2
        Person person2;
        person2 = new Person();

        //3
        var person3 = new Person();

    }

}
