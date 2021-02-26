public class Test08 {
    public static void main(String[] args){
        for (int i = 0; i <= 20; ++i) {
            for (int j = 0; j <= 33; ++j) {
                for (int k = 0; k <= 300; k += 3) {
                    if ((i + j + k) == 100 && (i*5 + j*3 + k/3) == 100) {
                        System.out.printf("公鸡：%d只，母鸡：%d只，小鸡：%d只\n", i , j, k);
                    }
                }
            }
        }
    }

}
