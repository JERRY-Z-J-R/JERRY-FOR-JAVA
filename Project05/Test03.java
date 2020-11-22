import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        printNi(arr);
    }

    public static void printNi(int[] arr) {
        int tamp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            tamp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tamp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
