package PZN;

public class MethodParameter {

    public static void main(String[] args) {

        //masukkan argumen ke dalam parameter
        sayHello("Asep", "Sutisna");

    }

    //Buat 2 parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("Assalamu'alaikum " + firstName + " " + lastName);
    }


}
