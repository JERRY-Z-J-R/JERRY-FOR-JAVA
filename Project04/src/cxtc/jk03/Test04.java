package cxtc.jk03;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数（不多于5位）：");
        int number = scanner.nextInt();

        int count = 0;

        while (number != 0) {
            int end = number % 10;
            number /= 10;
            count++;
            System.out.print(end);
        }
        System.out.println("该数是一个" + count + "位数");
    }
}
