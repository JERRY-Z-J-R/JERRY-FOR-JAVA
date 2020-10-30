package cxtc.jk03;

public class Test08 {
    public static void main(String[] args) {
        //方法一：
        for (int cock = 0; cock <= 20; cock++) {
            for (int hen = 0; hen <= 33; hen++) {
                int chick = 100 - cock - hen;
                if (cock * 5 + hen * 3 + chick / 3 == 100 && chick % 3 == 0) {
                    System.out.println("公鸡" + cock + "只, 母鸡" + hen + "只， 小鸡" + chick + "只");
                }
            }
        }

        System.out.println("**********************************");

        //方法二：
        for (int cock = 0; cock <= 20; cock++) {
            for (int hen = 0; hen <= 33; hen++) {
                for (int chick = 0; chick <= 100; chick++) {
                    if (cock + hen + chick == 100 && 5 * cock + 3 * hen + chick / 3 == 100 && chick % 3 == 0) {
                        System.out.println("公鸡" + cock + "只, 母鸡" + hen + "只， 小鸡" + chick + "只");
                    }
                }
            }
        }
    }
}


