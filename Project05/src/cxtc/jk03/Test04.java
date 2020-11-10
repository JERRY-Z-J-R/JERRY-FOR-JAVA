package cxtc.jk03;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 3, 9, 22, 3};
        arrIndex(arr, 3);
    }

    public static void arrIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("arr[" + i + "]");
                break;
            }
        }
    }
}
