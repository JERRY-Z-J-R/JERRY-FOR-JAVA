/*
* 项目：具有用户登录功能的猜数游戏
* 姓名：周吉瑞 20190521340
* 时间：2020/10/26
 */

package cxtc.jk03;
import java.util.Scanner;
import java.util.Random;

public class JerryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //绘制界面
        System.out.println("***************************");
        System.out.println("******JERRY'S 猜数游戏******");
        System.out.println("***************************");

        //用户注册界面
        System.out.println("*********请先注册用户********");
        String userName = registerUserName();   //调用用户名注册函数
        String password = registerPassword();   //调用密码设置函数

        System.out.println(userName + ", " + password);

        for (int i = 0; i < 100; i++) {
            System.out.println("****************************");
        }//for

        System.out.println("*********用户注册成功*********");
        System.out.println("***********登录游戏**********");

        boolean flag = false;   //flag作为用户名密码是否输入正确的标志
        for (int i = 1; i <= 3; i++) {
            flag = login(userName, password);   //调用登录函数
            if (flag == true) {
                for (int j = 0; j < 100; j++) {
                    System.out.println("****************************");
                }//for
                System.out.println("******成功登录，开始游戏!******");
                guessNumberGame();  //调用游戏函数
                break;
            }//if
            if (i != 3) {
                System.out.println("用户名密码错误，还剩" + (3 - i) + "次机会");
            } else {
                System.out.println("*****3次错误，自动退出游戏！*****");
            }//else
        }//for


    }//main

    //用户名注册函数
    public static String registerUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scanner.next();
        return userName;
    }//registerUserName

    //密码设置函数
    public static String registerPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入密码：");
        String password = scanner.next();
        return password;
    }//registerPassword

    //登录功能函数
    public static boolean login(String userName, String password) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String userNameTest = scanner.next();

        System.out.print("请输入密码：");
        String passwordTest = scanner.next();

        if (userNameTest.equals(userName) && passwordTest.equals(password)) {
            return true;
        } else {
            return false;
        }//else

    }//login

    //游戏功能函数
    public static void guessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******Game  Start!!!*******");
        int count = 0;

        //获取1~100之间的随机数
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;

        while (true) {
            System.out.print("请猜一个1~100的整数：");
            int userNum = scanner.nextInt();
            count++;

            if (userNum == randNum) {
                System.out.println("OMG小天才，猜对啦！");
                System.out.println("共猜测" + count + "次");
                break;
            } else if (userNum < randNum) {
                System.out.println("亲爱的，猜小啦！");
            } else {
                System.out.println("小可爱，猜大啦！");
            }//else
        }//while
    }//guessNumberGame

}
