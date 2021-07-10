public class BreakContinueTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){

            if (i % 4 == 0){
               // break;//123
               continue;//12345678910
            }
            System.out.println(i);
        }
        System.out.println("\n");
        //***********************

        laber:for (int i = 1; i <= 4; i++){

            for (int j = 1; j<= 10; j++){

                if (j % 4 == 0){
                    //break ;//默认跳出包裹此关键字最近的一层循环
                    //continue ;

                    //break laber;//结束指定标识的一层循环结构
                    continue laber;//结束指定标识的一层循环结构当此循环

                }
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
