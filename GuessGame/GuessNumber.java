/*
 * 项目：具有用户登录功能且集合了控制台与图形用户界面的猜数游戏
 * 姓名：周吉瑞 20190521340
 * 时间：2020/10/27
 */

import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessNumber extends JFrame {
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

        //确认用户名及密码
        while (true) {
            System.out.println(userName + "，" + password);  //输出用户名及密码
            System.out.print("请确认信息 Y(Yes) / N(No):");
            String yn = scanner.next();
            if (yn.equals("Y") || yn.equals("Yes") || yn.equals("YES") || yn.equals("y") || yn.equals("yes")) {
                break;
            } else if (yn.equals("N") || yn.equals("No") || yn.equals("NO") || yn.equals("n") || yn.equals("no")) {
                System.out.println("请再次输入：");
                userName = registerUserName();  //调用用户名注册函数
                password = registerPassword();  //调用密码设置函数
            } else {
                System.out.print("输入错误，默认再次输入：");
                userName = registerUserName();  //调用用户名注册函数
                password = registerPassword();  //调用密码设置函数
            }//else
        }//while

        //模拟清屏
        for (int i = 0; i < 100; i++) {
            System.out.println("****************************");
        }//for

        System.out.println("*********用户注册成功*********");
        System.out.println("***********登录游戏**********");

        boolean flag = false;   //false作为用户名密码是否输入正确的标志
        for (int i = 1; i <= 3; i++) {
            flag = login(userName, password);   //调用登录函数
            if (flag == true) {

                //模拟清屏
                for (int j = 0; j < 100; j++) {
                    System.out.println("****************************");
                }//for

                System.out.println("******成功登录，开始游戏!******");
                System.out.println("********请选择游戏界面*********");
                System.out.println("1.控制台界面");
                System.out.println("2.图形用户界面");
                System.out.print("请输入界面序号：");
                int n = scanner.nextInt();
                if (n == 1) {
                    guessNumberGame();  //调用游戏函数
                    break;
                } else if (n == 2) {
                    GuessNumber theGame = new GuessNumber();
                    theGame.newGame();
                    theGame.setSize(new Dimension(450, 300));
                    theGame.setVisible(true);
                    break;
                } else {
                    System.out.println("输入错误，默认选择图形用户界面");
                    GuessNumber theGame = new GuessNumber();
                    theGame.newGame();
                    theGame.setSize(new Dimension(450, 300));
                    theGame.setVisible(true);
                    break;
                }
            }//if
            if (flag == false) {
                if (i != 3) {
                    System.out.println("用户名密码错误，还剩" + (3 - i) + "次机会");
                } else {
                    System.out.println("*****3次错误，自动退出游戏！*****");
                }//else
            }//for
        }//for

    }//main

    //用户名注册函数
    public static String registerUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scanner.next();
        return userName;
    }//registerUserName()

    //密码设置函数
    public static String registerPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入密码：");
        String password = scanner.next();
        return password;
    }//registerPassword()

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

    }//login(String userName, String password)

    //***************************************************************
    //***************************************************************
    //***************************************************************
    //控制台界面
    //游戏功能函数

    public static void guessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("*******Game  Start!!!*******");
            int count = 0;
            int x = 0, y = 0;

            //获取1~100之间的随机数
            Random rand = new Random();
            int randNum = rand.nextInt(100) + 1;

            for (int i = 1; i <= 7; i++) {
                System.out.print("请猜一个1~100的整数：");
                int userNum = scanner.nextInt();
                count++;

                if (userNum == randNum) {
                    System.out.println("OMG小天才，猜了" + count + "次就猜对啦！让我们再玩一遍吧");
                    System.out.println("***************************");
                    System.out.println("1.再玩一次");
                    System.out.println("2.退出游戏");
                    System.out.println("*********请选择序号**********");
                    y = scanner.nextInt();
                    if (y == 1) {
                    } else if (y == 2) {
                        return;
                    } else {
                        System.out.println("输入错误，默认退出游戏");
                        return;
                    }//else
                } else if (userNum < randNum) {
                    System.out.println("亲爱的，猜小啦！");
                    System.out.println("已猜测" + count + "次" + " " + "还剩下" + (7 - count) + "次");
                } else {
                    System.out.println("小可爱，猜大啦！");
                    System.out.println("还剩下" + (7 - count) + "次");
                }//else
            }//for

            System.out.println("不对，没有机会了，正确答案是：" + randNum);
            System.out.println("***************************");
            System.out.println("1.再玩一次");
            System.out.println("2.退出游戏");
            System.out.println("*********请选择序号**********");
            x = scanner.nextInt();
            if (x == 1) {
            } else if (x == 2) {
                return;
            } else {
                System.out.println("输入错误，默认退出游戏");
                return;
            }
        }//while
    }//guessNumberGame()

    //***************************************************************
    //***************************************************************
    //***************************************************************
    //图形用户界面

    private JTextField txtGuess;
    private JLabel lblOutput;
    private JButton btnGuess;
    private JButton btnPlayAgain;
    private int theNumber;
    private int numberOfGames;

    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);
            if (guess < theNumber) {
                message = guess + "亲爱的，猜小啦！再猜一次！还剩" + (numberOfGames - 1) + "次机会！";
            } else if (guess > theNumber) {
                message = guess + "小可爱，猜大啦！再猜一次！还剩" + (numberOfGames - 1) + "次机会！";
            } else {
                message = guess + "OMG小天才，猜对啦！让我们再玩儿一遍吧！";
                btnPlayAgain.setVisible(true);
                gameOver();
                return;
            }

            numberOfGames--;

            if (numberOfGames <= 0) {
                message = guess + "不对，没有机会了，正确答案是：" + theNumber;
                btnPlayAgain.setVisible(true);
                gameOver();
            }

        } catch (Exception e) {
            message = "请输入1-100之间的整数！还剩" + numberOfGames + "次机会！";
        } finally {
            lblOutput.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
        }
    }//checkGuess()

    public void newGame() {
        theNumber = (int) (Math.random() * 100 + 1);
        numberOfGames = 7;  //第一次执行了一次初始化值为6
        btnGuess.setEnabled(true);
        txtGuess.setEnabled(true);
    }//newGame()

    //游戏结束使猜测按钮和输入框不可选中
    public void gameOver() {
        btnGuess.setEnabled(false);
        txtGuess.setEnabled(false);
    }//gameOver()

    public GuessNumber() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JERRY'S 猜数游戏");
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Game Start!!!");
        lblNewLabel.setFont(new Font("宋体", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(159, 27, 116, 18);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("\u8BF7\u731C\u4E00\u4E2A1-100\u4E4B\u95F4\u7684\u6570\u5B57\uFF1A");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1.setBounds(26, 72, 213, 15);
        getContentPane().add(lblNewLabel_1);

        txtGuess = new JTextField();
        txtGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                checkGuess();
            }
        });
        txtGuess.setBounds(250, 69, 66, 21);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);

        btnGuess = new JButton("猜一下！");
        btnGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                checkGuess();
            }
        });
        btnGuess.setBounds(170, 114, 93, 23);
        getContentPane().add(btnGuess);

        lblOutput = new JLabel("请在上面输入框中输入数字并点击猜一下！现在你有7次机会");
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(50, 214, 350, 15);
        getContentPane().add(lblOutput);

        btnPlayAgain = new JButton("再玩一次！");
        btnPlayAgain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newGame();
                txtGuess.setText("");
                lblOutput.setText("请在上面输入框中输入数字并点击猜一下！现在你有7次机会！");
                btnPlayAgain.setVisible(false);
            }
        });
        btnPlayAgain.setBounds(164, 164, 105, 23);
        btnPlayAgain.setVisible(false);
        getContentPane().add(btnPlayAgain);
    }//GuessNumber()

}
