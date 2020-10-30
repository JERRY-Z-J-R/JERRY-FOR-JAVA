package cxtc.jk03;

public class Test08 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i != 1 && i % 2 != 0) {
                sum = sum + -i;
            } else {
                sum = sum + i;
            }
        }

        System.out.println("1+2-3+4-5+6-7...+100 = " + sum);
    }
}
