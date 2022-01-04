package Udemy.PZN.JavaDasar;

public class S1_22_MethodReturnValue {
    public static void main(String[] args) {

        var result1 = sum(50,50);
        System.out.println(result1);

        System.out.println(sum(50,50));

        System.out.println(sum2(7,"*", 5));
        System.out.println(sum2(5, "-", 2));

        S1_22_MethodReturnValue Kurang = new S1_22_MethodReturnValue();
        System.out.println(Kurang.kurang(100,50));
    }

    static int sum (int value1, int value2){
        var total = value1 + value2;
        return total;
    };

    //Return value bisa lebih dari satu misalkan di percabangan
    static  int sum2 (int nilai1, String operasi, int nilai2){
        switch (operasi){
            case "+" -> {
                return nilai1 + nilai2;  //return value
            }
            case "*" -> {
                return  nilai1 * nilai2; //return value
            }
            default -> {
                return 0;
            }
        }
    }

    int kurang (int nilai1, int nilai2){
        var total = nilai1 - nilai2;
        return total;
    }
}
