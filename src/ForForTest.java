public class ForForTest {
    public static void main (String[] args){

        //***************
        //System.out.println("******");
        for (int i = 1; i <= 6; i++){
            System.out.println('*');
        }
        System.out.println("\n");

        /*
         ******
         ******
         ******
         ******
         */
        for (int j = 1; j <= 4; j++){
            for (int i = 1; i <= 6; i++){
                System.out.println('*');
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         */

        for (int i = 1; i <= 5; i++){//控制行数
            for (int j = 1; j <=i; j++){//控制列数
                System.out.println("*");
            }
            System.out.println();
        }
        /*
         *****
         ****
         ***
         **
         */

        for (int i = 1; i<= 5; i++){
            for (int j = 1; j <= 6 - i; j++){
                System.out.println("*");
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         */
    }
}