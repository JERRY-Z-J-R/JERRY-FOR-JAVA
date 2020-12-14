import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 2, 22, 4, 6, 9, 9};
        printMin(arr);
    }

    public static void printMin(int[] arr) {
        int min = 9999999;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("arr min = " + min);
    }
}
