import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int newArrLength = arrSearchAssignment(arr);
        arrSearchPrint(arr, newArrLength);
    }

    public static int arrSearchAssignment(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int newArrLength = 9;
        System.out.print("输入：");
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (count > 9) {
                break;
            }
            arr[i] = scanner.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    newArrLength--;
                }
            }
        }
        return newArrLength;
    }

    public static void arrSearchPrint(int[] arr, int newArrLength) {
        System.out.print("输出：");
        for (int i = 0; i < newArrLength; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
