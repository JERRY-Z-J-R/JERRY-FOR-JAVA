import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class GuessNum extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    JTextField text,text2;
    JButton button,button2,button3;
    int randomNum,count;
    public GuessNum(){
        setTitle("猜数游戏");
        setLayout(new FlowLayout());
        setSize(230,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("随机生成一个数");
        button.setSize(5,10);
        add(button);
        add(new JLabel("请输入所猜数字:"));
        text = new JTextField(15);
        add(text);
        add(new JLabel("提示框:"));
        text2 = new JTextField(15);
        add(text2);
        button2 = new JButton("确定");
        button2.setSize(4,5);
        add(button2);
        setVisible(true);
        button3 = new JButton("清空");
        button3.setSize(6,7);
        add(button3);
        setVisible(true);
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        text.addActionListener(this);
    }
    public static void main(String[] args) {
        new GuessNum();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            randomNum = (int)(Math.random()*100)+1;//强制转换为int
        }
        if(e.getSource()==button3){
            text.setText("");
            text2.setText("");
            count=0;
        }

        if(e.getActionCommand().equals("确定")|e.getSource()==text|e.getSource()==button2){
            do{
                int guess = Integer.parseInt(text.getText());
                if(randomNum< guess){
                    text2.setText("猜大了，重新猜下");
                    text.setText("");
                    count++;
                }
                else if(randomNum > guess){
                    text2.setText("猜小了，重新猜下");
                    text.setText("");
                    count++;
                }else{ count++;
                    break;
                }
            }while(true);

            text2.setText("猜的数是"+randomNum+"猜了"+count+"次");
        }
    }
}
