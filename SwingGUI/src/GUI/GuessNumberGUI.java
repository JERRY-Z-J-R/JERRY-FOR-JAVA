import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessNumberGUI extends JFrame{
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
            if(guess < theNumber) {
                message = guess + "太小了！再猜一次！还剩" + (numberOfGames-1) + "次机会！";
            }else if( guess > theNumber) {
                message = guess + "太大了！再猜一次！还剩" + (numberOfGames-1) + "次机会！";
            }else {
                message = guess + "就是那个数字！你猜对啦！让我们再玩儿一遍吧！";
                btnPlayAgain.setVisible(true);
                gameOver();
                return;
            }

            numberOfGames--;

            if (numberOfGames <= 0){
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
    }

    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
        numberOfGames = 7;  //第一次执行了一次初始化值为6
        btnGuess.setEnabled(true);
        txtGuess.setEnabled(true);
    }

    //游戏结束使猜测按钮和输入框不可选中
    public void gameOver(){
        btnGuess.setEnabled(false);
        txtGuess.setEnabled(false);
    }

    public GuessNumberGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JAVA\u731C\u6570\u5B57");
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("JAVA\u731C\u6570\u5B57");
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
                lblOutput.setText("请在上面输入框中输入数字并点击猜一下！你有7次机会！");
                btnPlayAgain.setVisible(false);
            }
        });
        btnPlayAgain.setBounds(164, 164, 105, 23);
        btnPlayAgain.setVisible(false);
        getContentPane().add(btnPlayAgain);
    }

    public static void main(String args[]) {
        GuessNumberGUI theGame = new GuessNumberGUI();
        theGame.newGame();
        theGame.setSize(new Dimension(450, 300));
        theGame.setVisible(true);
    }
}