import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入行数：");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
