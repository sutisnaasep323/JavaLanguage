package KT;

public class LoopingBersarang_33 {
    public static void main(String[] args) {

        //Looping bersarang

        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // looping segitiga, cara ke-1
        for (int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // looping segitiga, cara ke-2
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.println();
        }

        //=========================================
        System.out.println();
        int x,y;
        int batas = 9;
        for (x = 0; x < batas; x++){
            for (y = batas; y > x; y--){
                System.out.print(" ");
            }
            for (y = 0; y < x; y++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for (x = 0; x < batas; x++){
            for ( y = 0; y < x; y++){
                System.out.print(" ");
            }
            for (y = batas; y > x; y--){
                System.out.print(" *");
            }
            System.out.println();
        }

        int k = 9;
        for(int i = 0; i < k; i++){
            for(int j=0; j < k; j++){
                if ((i+j) >= 9){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i = 0; i < k; i++){
            for(int j=0; j < i; j++){
                System.out.print(" ");
            }
            for ( int z = k; z > i; z--){
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            //System.out.print("Loop " + i);
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if ( (i+j) == 4){
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if ( i == j){
                    break;
                } else if ((i+j)==8){
                    break;
                }

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 9; i++){



            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if ( i == j){
                    break;
                } else if ((i+j)==8){
                    break;
                }

            }
            System.out.println();
        }
    }
}
