package KT;

public class TipeDataFundamentalDanPrimitive_09 {
    public static void main(String[] args) {
    //Integer, bilangan bulat (satuan)
        int i = 10;
        int i2 = 2147483647;
        System.out.println("===INTEGER===");
        System.out.println("Nilai integer i = " + i);
        System.out.println("Nilai integer i = " + (i2+1)); // jika melebihi nilai maksimal akan muter balik ke nilai minimal
        // dibawah ini adalah helper class
        System.out.println("Nilai min = " + Integer.MIN_VALUE); // nilai Min Integer = -2147483648
        System.out.println("Nilai max = " + Integer.MAX_VALUE); // nilai Max Integer = 2147483647

        System.out.println("Besar integer = " + Integer.BYTES + " Bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " Bit");
        /*
        1 byte = 8 bit
        4 byte = 32 bit
         */
    //Byte, satuan juga
        byte b = 2;
        byte b2 = 127;
        System.out.println("===BYTE===");
        System.out.println("Nilai byte b = " + b);
        System.out.println("Nilai byte b = " + (b2+1));
        System.out.println("Nilai min = " + Byte.MIN_VALUE); // nilai Min Byte = -128
        System.out.println("Nilai max = " + Byte.MAX_VALUE); // nilai Max Byte = 127
        System.out.println("Besar byte = " + Byte.BYTES + " Bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " Bit");

    //Character, satuan juga
        char s = 2;
        char s2 = 32767;
        System.out.println("===SHORT===");
        System.out.println("Nilai char b = " + s);
        System.out.println("Nilai char b = " + (s2+1));
        System.out.println("Nilai min = " + Character.MIN_VALUE); // nilai Min Character = -32768
        System.out.println("Nilai max = " + Character.MAX_VALUE); // nilai Max Character = 32767
        System.out.println("Besar char = " + Character.BYTES + " Bytes");
        System.out.println("Besar char = " + Character.SIZE + " Bit");

    //Long, satuan juga. kita bisa tambahkan L untuk membedakan bahwa ini tipe data Long
        long l = 2L;
        long l2 = 10000000000000000L;
        System.out.println("===LONG===");
        System.out.println("Nilai long b = " + l);
        System.out.println("Nilai long b = " + (l2+1));
        System.out.println("Nilai min = " + Long.MIN_VALUE); // nilai Min Long = -9223372036854775808
        System.out.println("Nilai max = " + Long.MAX_VALUE); // nilai Max Long = 9223372036854775807
        System.out.println("Besar long = " + Long.BYTES + " Bytes");
        System.out.println("Besar long = " + Long.SIZE + " Bit");

    //Double, nilai yang ada koma nya. kita bisa tambahkan d untuk membedakan bahwa ini tipe data double
        double d = 20.2d;
        double d2 = 127d;
        System.out.println("===DOUBLE===");
        System.out.println("Nilai double b = " + d);
        System.out.println("Nilai double b = " + (d2+1));
        System.out.println("Nilai min = " + Double.MIN_VALUE); // nilai Min double = -9223372036854775808
        System.out.println("Nilai max = " + Double.MAX_VALUE); // nilai Max double = 9223372036854775807
        System.out.println("Besar double = " + Double.BYTES + " Bytes");
        System.out.println("Besar double = " + Double.SIZE + " Bit");

    //Float, nilai yang ada koma nya. kita bisa tambahkan f untuk membedakan bahwa ini tipe data double
        float f = 25.2f;
        float f2 = 127f;
        System.out.println("===FLOAT===");
        System.out.println("Nilai float f = " + d);
        System.out.println("Nilai float f = " + (d2+1));
        System.out.println("Nilai min = " + Float.MIN_VALUE); // nilai Min Float = -32768
        System.out.println("Nilai max = " + Float.MAX_VALUE); // nilai Max Float = 32767
        System.out.println("Besar float = " + Float.BYTES + " Bytes");
        System.out.println("Besar float = " + Float.SIZE + " Bit");

    //Char, Karakter berdasarkan asci
        char c = 'C';
        char c2 = 't';
        System.out.println("===SHORT===");
        System.out.println("Nilai char c = " + c);
        System.out.println("Nilai char c2 = " + (c2+1));
        System.out.println("Nilai min = " + Character.MIN_VALUE); // nilai Min Character = -32768
        System.out.println("Nilai max = " + Character.MAX_VALUE); // nilai Max Character = 32767
        System.out.println("Besar char = " + Character.BYTES + " Bytes");
        System.out.println("Besar char = " + Character.SIZE + " Bit");

    //Boolean, hanya true/false besarnya 1 bit
        boolean bb = true;
        boolean bb2 = false;
        System.out.println("===BOOLEAN===");
        System.out.println("Nilai boolean b = " + bb);
        System.out.println("Nilai boolean bb2 = " + bb2);
        System.out.println("Nilai min = " + Boolean.TRUE);
        System.out.println("Nilai max = " + Boolean.FALSE);
    }
}
