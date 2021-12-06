package Udemy.PZN.JavaDasar;

public class S1_18_Break {
    public static void main(String[] args) {

        var counter = 1;

        while (true){
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 10){
                break; //menghentikan perulangan total
            }
        }

        System.out.println("Perulangan berhenti");

    }
}
