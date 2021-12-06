package Udemy.PZN.JavaDasar;

public class S1_19_ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Abu", "Hammad", "Asep", "Sutisna"
        };


        //Tanpa For Each
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("\n");

        // FOR EACH
        for (String name : names){
            System.out.println(name);
        }
    }
}
