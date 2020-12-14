import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account janeSmith = new Account();

        System.out.print("input customer:");
        String customer = scanner.nextLine();
        janeSmith.setCustomer(customer);        

        System.out.print("input id:");
        int id = scanner.nextInt();
        janeSmith.setId(id);

        System.out.print("input balance:");
        double balance = scanner.nextDouble();
        janeSmith.setBalance(balance);

        System.out.print("input annualInterestRate:");
        double annualInterestRate = scanner.nextDouble();
        janeSmith.setAnnualInterestRate(annualInterestRate);

        System.out.print("input deposit money:");
        double dmoney = scanner.nextDouble();
        janeSmith.deposit(dmoney);

        System.out.print("input withdraw money:");
        double wmoney = scanner.nextDouble();
        janeSmith.withdraw(wmoney);

        System.out.print("input withdraw money:");
        double wmoney2 = scanner.nextDouble();
        janeSmith.withdraw(wmoney2);

        System.out.println("----------------");

        System.out.println(janeSmith.getCustomer());
        System.out.println(janeSmith.getId());
        System.out.println(janeSmith.getBalance());
        System.out.println(janeSmith.getAnnualInterestRate());
    }
}

class Account {
    private String customer;
    private int id;
    private double balance;
    private double annualInterestRate;

    public void setCustomer(String customer) {
        this.customer = customer; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdraw(double money) {
        if (money <= balance) {
            System.out.println("成功取出：" + money);
            balance = balance - money;
        } else {
            System.out.println("余额不足，取钱失败");
        }
    }

    public void deposit(double money) {
        System.out.println("成功存入：" + money);
        balance = balance + money;
    }
}
