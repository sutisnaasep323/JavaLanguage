package KT;

public class OperatorLogika_15 {

    public static void main(String[] args) {
        //Operator Logika, operasi yang bisa kita lakukan kepada tipe data boolean
        //AND, OR, X-OR, NEGASI

        boolean a, b, c;

        //OR / atau (||) -> namanya pipe
        System.out.println("======= OR (||) =======");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        //AND / Dan (&&)
        System.out.println("======= AND (&&) =======");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        //X-OR / Exlusive OR (^) -> seperti topi
        // X-OR ini jika kedua nilai sama akan bernilai True, jika berbeda False
        System.out.println("======= X-OR (^) =======");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT / NEGASI -> FLIPPING (!)
        System.out.println("======= NEGASI (!) =======");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);


    }

}
