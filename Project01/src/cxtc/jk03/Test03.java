package cxtc.jk03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个成绩：");
        double grade = scanner.nextDouble();

        if (grade >= 90 && grade <= 100) {
            System.out.println("优秀");
        } else if (grade >= 80) {
            System.out.println("良好");
        } else if (grade >= 70) {
            System.out.println("中等");
        } else if (grade >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
