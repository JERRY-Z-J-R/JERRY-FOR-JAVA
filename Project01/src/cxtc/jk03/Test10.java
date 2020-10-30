package cxtc.jk03;

public class Test10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 100; i <= 999; i++) {
            int bai = (i / 100) % 10;
            int shi = (i / 10) % 10;
            int ge = (i / 1) % 10;

            if (bai * bai *bai + shi * shi * shi + ge * ge * ge == i) {
                System.out.println(i);
                sum++;
            }
        }

        System.out.println("水仙花数共有：" + sum + " 个");
    }
}
