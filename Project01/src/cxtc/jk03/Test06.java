package cxtc.jk03;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个月份：");
        int month = scanner.nextInt();

        switch (month) {
            case (12):
            case (1):
            case (2):
                System.out.println("该月是冬季");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("该月是春季");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("该月是夏季");
                break;
            default:
                System.out.println("该月是秋季");
                break;
        }
    }
}
