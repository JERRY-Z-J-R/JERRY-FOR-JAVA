import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入num1：");
        int num1 = scanner.nextInt();
        System.out.print("请输入num2：");
        int num2 = scanner.nextInt();
        System.out.print("请输入num3：");
        int num3 = scanner.nextInt();

        int mid = 0;

        if (num1 > num2) {
            mid = num1;
            num1 = num2;
            num2 = mid;
        }
        if (num1 > num3) {
            mid = num1;
            num1 = num3;
            num3 = mid;
        }
        if (num2 > num3) {
            mid = num2;
            num2 = num3;
            num3 = mid;
        }

        System.out.println("从小到大排序为：" + num1 + " " + num2 + " " + num3);
    }
}
