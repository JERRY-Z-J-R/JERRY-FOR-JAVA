package cxtc.jk03;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {10 ,20, 30},
                {100, 200}
        };
        arrPrint(arr);
    }

    public static void arrPrint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
