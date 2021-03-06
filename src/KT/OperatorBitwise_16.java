package KT;

public class OperatorBitwise_16 {

    public static void main(String[] args) {

        //Operator Bitwise, operator untuk melakukan pada nilai bit

        byte a = 3;
        byte b,c;
        String a_bits, b_bits, c_bits ;

        //String Format, untuk membuat format string dan akan di taruh di variable a_bits, seperti soutf, tapi itu untuk menampilkan ke console.

        // Operator SHIFT LEFT / GESER KIRI
        System.out.println("====== SHIFT LEFT ======");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = (byte) (a << 3); // b digeser ke kiri dari nilai a sebanyak 2. disana ada casting karena kita menggunakan byte
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d --> ini hasil geser kiri\n", b_bits, b);

        // Operator SHIFT RIGHT / GESER KANAN
        System.out.println("====== SHIFT RIGHT ======");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = (byte) (a >> 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d --> ini hasil geser kanan\n", b_bits, b);

        System.out.println();

        // Operator BITWISE OR
        System.out.println("====== BITWISE OR (|) ======");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b);
        System.out.println("-------------------- OR");
        c = (byte) (a | b); // ---> ini operasi OR di Bit
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n", c_bits, c);

        System.out.println();

        // Operator BITWISE AND
        System.out.println("====== BITWISE AND (&) ======");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b);
        System.out.println("-------------------- AND");
        c = (byte) (a & b); // ---> ini operasi AND di Bit
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n", c_bits, c);

        System.out.println();

        // Operator BITWISE X-OR
        System.out.println("====== BITWISE X-OR (^) ======");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b);
        System.out.println("-------------------- X-OR");
        c = (byte) (a ^ b); // ---> ini operasi X-OR di Bit
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n", c_bits, c);

        System.out.println();

        // Operasi Negasi / NOT
        System.out.println("====== BITWISE NOT (~) ======");
        a = 24;
        b = (byte) (~a);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
        System.out.println("-------------------- NOTz");
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d\n", b_bits, b);

    }

}
