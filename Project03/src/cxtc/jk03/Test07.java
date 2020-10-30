package cxtc.jk03;

public class Test07 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; ++i) {
            for (int j = i + 1; j <= 4; ++j) {
                for (int k= j + 1; k <= 4; ++k) {
                    System.out.printf("%d%d%d\n", i, j, k);
                    System.out.printf("%d%d%d\n", i, k, j);
                    System.out.printf("%d%d%d\n", j, i, k);
                    System.out.printf("%d%d%d\n", j, k, i);
                    System.out.printf("%d%d%d\n", k, j, i);
                    System.out.printf("%d%d%d\n", k, i, j);
                    count += 6;
                }
            }
        }

        System.out.println("总数为：" + count + " 个");
    }
}
