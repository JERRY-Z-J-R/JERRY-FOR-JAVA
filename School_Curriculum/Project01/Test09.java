import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int num = scanner.nextInt();

        int sum = 1;

        for (int i = num; i >= 1; i--) {
            sum = sum * i;
        }

        System.out.println(num + " 的阶乘为：" + sum);
    }
}
