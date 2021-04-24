package PZN;

public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = 'E';
        var nilai2 = 'E';

        //SWITCH CASE
        switch (nilai){

            case 'A':
                System.out.println("Anda Hebat");
                break;
            //case B & C digabung
            case 'B':
            case 'C':
                System.out.println("Anda Lumayan");
                break;
            case 'D', 'E':
                System.out.println("Anda Buruk");
                break;
            default:
                System.out.println("Anda bukan Human");

        }

        System.out.println();


        //SWITCH LAMBDA. Lambda adalah " -> {} " dengan ini kita tidak membutuhkan break
        switch (nilai2){
            case 'A' -> System.out.println("Anda Keren");
            case 'B', 'C' -> System.out.println("Anda mantap");
            case 'D' -> System.out.println("Good");
            default -> {
                System.out.println("Anda tidak lulus");
                System.out.println("anda mengulangi lagi tahun depan");
            }
        }

        //SWITCH tanpa Yield. yield = menampung nilai pengembalian. kalau tanpa yield itu akan ribet kita satu-satu

        String ucapan;
        switch (nilai2){
            case 'A' -> ucapan = "Anda Keren";
            case 'B', 'C' -> ucapan = "Anda mantap";
            case 'D' -> ucapan = "Good";
            default -> {

                ucapan = "anda mengulangi lagi tahun depan";
            }
        }
        System.out.println(ucapan);

        //SWITCH dengan Yield. simple tanpa ada tanda panah dan variabel yang banyak
        ucapan = switch (nilai2){
            case 'A':
                yield "Anda Kern";
            case 'B', 'C' :
                yield "Anda mantap";
            case 'D' :
                yield "Good";
            default :
                yield "anda mengulangi lagi tahun depan";
        };
        System.out.println(ucapan);

    }

}
