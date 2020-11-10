package cxtc.jk03;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("输入：");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        arrScreen(arr);
        System.out.print("输出：");
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(arr[arr.length-1]);
    }

    public static void arrScreen(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //遇到重复的数字，将该数字后的数字依次往前挪一个以覆盖该数字
                if (arr[i] == arr[j]) {
                    for (int k = j; k < arr.length - 1; k++) {
                        arr[k] = arr[k+1];
                    }
                }
            }
        }
    }
}
