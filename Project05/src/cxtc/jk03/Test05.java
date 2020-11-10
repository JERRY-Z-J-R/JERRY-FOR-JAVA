package cxtc.jk03;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int numberOfElements = scanner.nextInt();
        int[] arr = new int[numberOfElements];
        arrAssignment(arr);
        int[] newArr = deRepetition(arr);
        arrPrint(newArr);
    }

    public static void arrAssignment(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入：");
        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
    }

    public static int[] deRepetition(int[] arr) {
        int[] flag = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag[j] = 1;
                }
            }
        }
        int flagSum = 0;
        for (int i : flag) {
            flagSum += i;
        }
        int newLength = arr.length - flagSum;
        int[] newArr = new int[newLength];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag[i] == 0) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    public static void arrPrint(int[] arr) {
        System.out.print("输出：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
