package cxtc.jk03;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int num = scanner.nextInt();

        int figure = 0;

        int num_copy = num;
        while (num_copy != 0) {
            num_copy /= 10;
            figure++;
        }

        System.out.println("该数为：" + figure + "位数");
        System.out.print("逆序输出各位数分别为：");

        for (int i = 1; i <= figure; ++i) {
            if (i == 1) {
                System.out.print((num % 10) + " ");
            } else {
                int n = 1;
                for (int j = 1; j < i; ++j) {
                    n *= 10;
                }
                System.out.print(num / n % 10 + " ");
            }
        }

    }
}
