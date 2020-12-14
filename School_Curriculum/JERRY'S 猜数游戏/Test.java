//测试伪随机数的概率是否正确

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            int num = rand.nextInt(10) + 1;
            if (num == 5) {
                count++;
            }
        }
        System.out.println("10000次测试中，" + "随机产生1~10中5的概率是：" + count / 10000.0);
    }
}
