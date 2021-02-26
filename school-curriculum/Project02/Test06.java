public class Test06 {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;

        while (num <= 999) {
            int bai = num / 100 % 10;
            int shi = num / 10 % 10;
            int ge = num / 1 % 10;

            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == num) {
                System.out.println(num);
                count++;
            }

            num++;
        }

        System.out.println("count = " + count);

    }
}
