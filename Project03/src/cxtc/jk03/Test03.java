package cxtc.jk03;

public class Test03 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; ++i) {
            sum = 0;
            for (int j = 1; j < i; ++j) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (i == sum) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("1000以内所有的完数共有：" + count + "个");
    }
}
