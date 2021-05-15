package OOP.PZN;

public class PersonApp {

    public static void main(String[] args) {
        //Pembuatan Objek
        //1
        Person person1 = new Person("Abu Hammad", "Nagrak");
        // data dibawah ini tidak diperlukan karena sudah menggunakan constructor
//        person1.name = "Abu Hammad"; // manipulasi
//        person1.address = "Nagrak";  // manipulasi / diubah
//        //person1.country = "Saudi Arabia"; // Akan ERROR karena field nya sudah FINAL. kita hanya bisa panggil

            //Pemanggilan
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //2
        Person person2;
        person2 = new Person("Asep", "Bogor");
        person2.sayHello("Abu Hammad");

        //3
        var person3 = new Person("Yumi", "Cikeas");

    }

}
