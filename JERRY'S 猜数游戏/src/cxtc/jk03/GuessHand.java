/*
 **题目：玩家与电脑进行猜拳游戏，玩家行为采用输入方式，电脑行为采用随机形式。
 **姓名：周吉瑞 20190521340
 **时间：2020/10/30
 */

package cxtc.jk03;
import java.util.Scanner;
import  java.util.Random;

public class GuessHand {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("*****GuessHandGame******");
        System.out.println("************************");
        System.out.println("*********1.石头**********");
        System.out.println("*********2.剪子**********");
        System.out.println("**********3.布***********");
        System.out.println("************************");
        guessHandGame();
    }

    public static void guessHandGame() {
        System.out.println("******Game  Start!******");

        while (true) {
            Random rand = new Random();
            int sysNum = rand.nextInt(3) + 1;
            printHand(sysNum);
            System.out.println("-------------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("请出拳:");
            int userNum = scanner.nextInt();

            if ((userNum == 1 && sysNum == 1) || (userNum == 2 && sysNum == 2) || (userNum == 3 && sysNum == 3)) {
                System.out.println("平局，请再次出拳");
            }
            if ((userNum == 1 && sysNum == 2) || (userNum == 2 && sysNum == 3) || (userNum == 3 && sysNum == 1)) {
                System.out.println("恭喜你赢了！");
            }
            if ((sysNum == 1 && userNum == 2) || (sysNum == 2 && userNum == 3) || (sysNum == 3 && userNum == 1)) {
                System.out.println("遗憾你输了！");
            }
        }//while
    }

    public static void printHand(int num) {
        if (num == 1) {
            System.out.println("电脑出拳为：石头");
        }
        if (num == 2) {
            System.out.println("电脑出拳为：剪刀");
        }
        if (num == 3) {
            System.out.println("电脑出拳为：布");
        }
    }
}
