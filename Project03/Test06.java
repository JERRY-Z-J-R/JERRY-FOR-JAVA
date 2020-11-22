public class Test06 {
    public static void main(String[] args) {
        int count_1 = 1;
        int count_2 = 0;

        for (int i = 1; i <= 10; ++i) {
            count_1 = 1;

            for (int j = i; j >= 1; --j) {
                count_1 *= j;
            }

            count_2 += count_1;
        }

        System.out.println("1!+2!+3!+4!+...+10! = " + count_2);
    }
}
