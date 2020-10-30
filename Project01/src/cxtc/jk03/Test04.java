package cxtc.jk03;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个月份：");
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("该月是冬季");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("该月是春季");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("该月是夏季");
        } else {
            System.out.println("该月是冬季");
        }
    }
}
