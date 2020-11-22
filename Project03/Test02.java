import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; ++i) {
            for (int j = i; j <= num; ++j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; ++k) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
