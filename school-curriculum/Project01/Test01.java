import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入a:");
        double a = scanner.nextDouble();
        System.out.print("请输入b:");
        double b = scanner.nextDouble();
        System.out.print("请输入c:");
        double c = scanner.nextDouble();

        double mid = (a < b)? a: b;
        double min = (mid < c)? mid: c;

        System.out.println("最小值: " + min);
    }
}
