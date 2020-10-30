package cxtc.jk03;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个数：");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("该数为偶数");
        } else {
            System.out.println("该数为奇数");
        }
    }
}
