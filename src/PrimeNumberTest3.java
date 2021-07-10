/*
100000以内所有的质数的输出
质数：素数，只能被1和它本身整除的自然数  --> 从2开始，到这个数-1结束为止，都不能被这个数本身整除

对PrimeNumberTest,java文件中质数问题的优化
 */

public class PrimeNumberTest3 {
    public static void main(String[] args) {

        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值

        long start = System.currentTimeMillis();//获取当前时间距离1971-01-01 00：00：00 的毫秒数

        for(int i = 2; i <= 100000; i++){//遍历100000以内的自然数

            for (int j = 2; j < i; j++){//j:被i去除

                if (i % j == 0){//i被j除尽
                    isFlag = false;
                   break;//优化一：只对本身非质数的自然数是有效的
                }
            }
            if (isFlag == true){
                System.out.println(i);
            }
            //重置isFlag
            isFlag = true;
        }

        long end = System.currentTimeMillis();//获取当前时间距离1971-01-01 00：00：00 的毫秒数

        System.out.println("所花费的时间为：" + (end - start));//21800 - 优化一： break:3729
    }
}
