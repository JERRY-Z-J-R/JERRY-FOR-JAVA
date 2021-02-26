/*
 **题目：玩家与电脑进行猜拳游戏，玩家行为采用输入方式，电脑行为采用随机形式。
 **姓名：周吉瑞 20190521340
 **时间：2020/10/30
 */

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    static String AiRoles = "";         //全局字符串：机器角色名
    static String UsRoles = "";         //全局字符串：用户角色名
    static int AiFraction = 0;          //全局整型：机器得分数
    static int UsFraction = 0;          //全局整型：用户得分数
    static int gameCount = 0;           //全局整型：游戏次数

    public static void main(String[] args) {
        System.out.println("--------------欢迎进入游戏世界-------------");
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("**************** 猜拳开始！ ***************");
        System.out.println("*****************************************");
        System.out.println();

        roles();

        Scanner scanner = new Scanner(System.in);
        System.out.print("要开始吗？(y/n):");
        String gameFlag = scanner.next();

        if (gameFlag.equals("y") || gameFlag.equals("Y")) {
            while (true) {
                System.out.println("-----------------------------------------");
                gameCount++;
                if (guessGame() == true) {
                } else {
                    System.out.println("对战次数：" + gameCount);
                    System.out.println("姓名\t\t\t得分");
                    System.out.println(AiRoles + "\t\t\t" + AiFraction);
                    System.out.println(UsRoles + "\t\t\t" + UsFraction);
                    break;
                }//else
            }//while
        } else {
            System.out.println();
            System.out.println("已退出游戏！");
        }//else
    }//main()

    public static void roles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择对方角色（1.刘备 2.孙权 3.曹操）:");
        int AiRolesFlag = scanner.nextInt();

        if (AiRolesFlag == 1) {
            AiRoles = "刘备";
        } else if (AiRolesFlag == 2) {
            AiRoles = "孙权";
        } else {
            AiRoles = "曹操";
        }//else

        System.out.print("请输入你的姓名:");
        UsRoles = scanner.next();

        System.out.println(AiRoles + " vs " + UsRoles + " 对战");
    }//roles()

    public static boolean guessGame() {
        Random rand = new Random();
        int aiNum = rand.nextInt(3) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("请出拳（1.石头 2.剪刀 3.布）请输入相应数字：");
        int usNum = scanner.nextInt();

        if (usNum == 1) {
            System.out.println(UsRoles + "出拳：" + "石头");
        } else if (usNum == 2) {
            System.out.println(UsRoles + "出拳：" + "剪刀");
        } else {
            System.out.println(UsRoles + "出拳：" + "布");
        }//else

        if (aiNum == 1) {
            System.out.println(AiRoles + "出拳：" + "石头");
        } else if (aiNum == 2) {
            System.out.println(AiRoles + "出拳：" + "剪刀");
        } else {
            System.out.println(AiRoles + "出拳：" + "布");
        }//else

        if ((usNum == 1 && aiNum == 1) || (usNum == 2 && aiNum == 2) || (usNum == 3 && aiNum == 3)) {
            System.out.println("平局，请再次出拳");
            return true;
        }//if

        if ((usNum == 1 && aiNum == 2) || (usNum == 2 && aiNum == 3) || (usNum == 3 && aiNum == 1)) {
            UsFraction++;
            System.out.println("恭喜你赢了！");
            System.out.println();
            System.out.print("是否开始下一轮(y/n):");
            String gameFlag = scanner.next();
            if (gameFlag.equals("y") || gameFlag.equals("Y")) {
                return true;
            } else {
                return false;
            }//else
        }//if

        if ((aiNum == 1 && usNum == 2) || (aiNum == 2 && usNum == 3) || (aiNum == 3 && usNum == 1)) {
            AiFraction++;
            System.out.println("遗憾你输了！");
            System.out.println();
            System.out.print("是否开始下一轮(y/n):");
            String gameFlag = scanner.next();
            if (gameFlag.equals("y") || gameFlag.equals("Y")) {
                return true;
            } else {
                return false;
            }//else
        }//if

        return true;
    }//guessGame()

}
