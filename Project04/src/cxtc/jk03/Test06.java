package cxtc.jk03;

public class Test06 {
    public static void main(String[] args) {
        //方法一：
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact *= i;
            sum += fact;
        }
        System.out.println(sum);

        System.out.println("*********************");

        //方法二：
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            int fact2 = 1;
            for (int j = 1; j <= i; j++) {
                fact2 *= j;
            }
            sum2 += fact2;
        }
        System.out.println(sum2);
    }
}
