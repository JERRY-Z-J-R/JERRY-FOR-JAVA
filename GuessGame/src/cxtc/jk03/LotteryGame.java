/*
 **题目：福彩双色球游戏（选做，不计入平时成绩，做对期末加分）。
 **游戏说明如下：双色球投注区分为红色球号码区和蓝色球号码区，红色球号码区由1-33共33个号码组成，蓝色球号码区由1-16共16个号码组成。
 **投注时选择6个红球号码和1个蓝球号码组成一注进行单式投注，每注金额2元，中奖规则同福彩双色球规则。
 **姓名：周吉瑞 20190521340
 **时间：2020/10/30
 */

package cxtc.jk03;

import java.util.Scanner;
import java.util.Random;

public class LotteryGame {
    static int[] aiLotteryNumber = new int[7];      //全局数组：用于储存机器的随机号码
    static int[] usLotteryNumber = new int[7];      //全局数字：用于储存用户的所选号码
    static int numberOfBets = 0;                    //全局整型：用于储存下注数量

    public static void main(String[] args) {

        while (true) {                              //死循环
            gameInterface();                        //绘制界面

            if  (!selectMenu()) {           //选择菜单，若返回false那么退出系统
                System.out.println();
                System.out.println("已退出双色球彩票系统，谢谢使用！");
                break;
            }//if
        }//while
    }//main()

    //绘制界面函数
    public static void gameInterface() {
        System.out.println("----------- 欢迎进入双色球彩票系统 -----------");
        System.out.println("**************** 1.购买彩票 ***************");
        System.out.println("**************** 2.查看开奖 ***************");
        System.out.println("**************** 3.退出系统 ***************");
        System.out.println("------------------------------------------");
    }//gameInterface()

    //菜单选择函数
    public static boolean selectMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请选择菜单：");
        int gameFlag = scanner.nextInt();

        //进行功能选择后的提示
        if (gameFlag == 1) {
            System.out.println("【双色球彩票系统" + " ——> " + "购买彩票】");
            buyLotteryTickets();
        } else if (gameFlag == 2) {
            System.out.println("【双色球彩票系统" + " ——> " + "查看开奖】");
            viewTheDraw();
        } else {
            System.out.println("【双色球彩票系统" + " ——> " + "退出系统】");
            return false;
        }//else

        return true;
    }//selectMenu()

    //购买彩票功能函数
    public static void buyLotteryTickets() {
        Scanner scanner = new Scanner(System.in);

        machineSelectedNumber(aiLotteryNumber);         //本期号码利用随机机选功能提供

        System.out.print("请输入下注数量:");
        numberOfBets = scanner.nextInt();

        System.out.print("请输入（1.手选号码 2.机选号码）:");
        int flag = scanner.nextInt();

        if (flag == 1) {
            handPickNumber();                           //开启手选功能
        } else {
            machineSelectedNumber(usLotteryNumber);     //开启随机机选功能
        }

    }//buyLotteryTickets

    //查看开奖功能函数
    public static void viewTheDraw() {
        System.out.println("已买的彩票号为：");
        for (int i = 0; i <= 6; i++) {
            System.out.print(usLotteryNumber[i] + "\t");
        }//for

        System.out.println();

        System.out.println("当期中奖号码为：");
        for (int i = 0; i <= 6; i++) {
            System.out.print(aiLotteryNumber[i] + "\t");
        }//for

        System.out.println();

        winningStatistics();    //输出开奖情况
    }//viewTheDraw()

    //开奖情况功能函数
    public static void winningStatistics() {
        int redCount = 0;
        int greenCount = 0;

        for (int i = 1; i <= 5; i++) {
            if (aiLotteryNumber[i] == usLotteryNumber[i]) {
                redCount++;
            }//if
        }//for

        if (aiLotteryNumber[6] == usLotteryNumber[6]) {
            greenCount++;
        }//if

        if (redCount == 6 && greenCount == 1) {
            System.out.println("恭喜你！中了一等奖！");
            System.out.println("共下" + numberOfBets + "注" + ", 累积下注" + (numberOfBets * 2) + "元");
            System.out.println("累积中奖" + numberOfBets * 1000 +"万元");
        } else if (redCount == 6) {
            System.out.println("恭喜你！中了二等奖！");
            System.out.println("共下" + numberOfBets + "注" + ", 累积下注" + (numberOfBets * 2) + "元");
            System.out.println("累积中奖" + numberOfBets * 500 +"万元");
        } else if (redCount == 5 && greenCount == 1) {
            System.out.println("恭喜你！中了三等奖！");
            System.out.println("共下" + numberOfBets + "注" + ", 累积下注" + (numberOfBets * 2) + "元");
            System.out.println("累积中奖" + numberOfBets * 3000 +"元");
        } else if (redCount == 5 || (redCount == 4 && greenCount == 1)) {
            System.out.println("恭喜你！中了四等奖！");
            System.out.println("共下" + numberOfBets + "注" + ", 累积下注" + (numberOfBets * 2) + "元");
            System.out.println("累积中奖" + numberOfBets * 200 +"元");
        } else if (redCount == 4 || (redCount == 3 && greenCount == 1)) {
            System.out.println("恭喜你！中了五等奖！");
            System.out.println("共下" + numberOfBets + "注" + ", 累积下注" + (numberOfBets * 2) + "元");
            System.out.println("累积中奖" + numberOfBets * 10 +"元");
        } else if (greenCount == 1) {
            System.out.println("恭喜你！中了六等奖！");
            System.out.println("共下" + numberOfBets + "注" + ", 累积下注" + (numberOfBets * 2) + "元");
            System.out.println("累积中奖" + numberOfBets * 5 +"元");
        } else {
            System.out.println("很遗憾，你没有中奖！");
        }//else
    }//winningStatistics()

    //手选号码函数
    public static void handPickNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请顺序输入号码：");
        for (int i = 0; i <= 6; i++) {
            usLotteryNumber[i] = scanner.nextInt();
        }
    }//handPickNumber()

    //机选号码函数
    public static void machineSelectedNumber(int[] lotteryNumber) {
        Random random = new Random();

        for (int i = 0; i <= 5; i++) {
            lotteryNumber[i] = random.nextInt(33) + 1;
        }
        lotteryNumber[6] = random.nextInt(16) + 1;
    }//machineSelectedNumber(int[] lotteryNumber)

}
