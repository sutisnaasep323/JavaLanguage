package Udemy.PZN.S1_JavaDasar;

public class S1_26_Scope {
    public static void main(String[] args) {

    }

    static void sayHell(String name){
        String hello = "Hello " + name;

        if (!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
            System.out.println(hello); // bisa akses yang dalam ke luar
        }

        System.out.println(hello);
        //System.out.println(hi); // tidak bisa akses (error)

    }
}
