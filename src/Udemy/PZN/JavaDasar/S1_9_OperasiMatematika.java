package Udemy.PZN.JavaDasar;

public class S1_9_OperasiMatematika {
    public static void main(String[] args) {

        // Operasi Matematika
        int a = 100, b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a % b);

        // Augmented Assigment

        a += 50; // a = a + 50;
        System.out.println(a); // 150

        a -= 30;
        System.out.println(a); // 120

        a /= 2;
        System.out.println(a); // 60

        // Unary Operator

        int c = 50;

        c++;
        // ++cc
        System.out.println(c);

        c--;
        // -cc;
        System.out.println(c);

    }
}
