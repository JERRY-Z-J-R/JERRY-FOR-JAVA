package cxtc.jk03;

public class Test01 {
    public static void main(String[] args) {
        int count = 0;
        double high = 0.01;

        while (high <= 8848) {
            high = high * 2;
            count++;
        }

        System.out.println("次数为：" + count);
    }
}
