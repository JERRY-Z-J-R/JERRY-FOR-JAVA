import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee teacher = new Employee();

        teacher.setSalary(8000);
        teacher.setPosition("Java teacher");
        teacher.setName("JERRY");

        System.err.println(teacher.getSalary());
        System.err.println(teacher.getPosition());
        System.err.println(teacher.getName());

        teacher.work();
        teacher.eat();
        teacher.raise();
    }
}

class Employee {
    private double salary;
    private String position;
    private String name;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.err.println("work!");
    }

    public void eat() {
        System.err.println("eat");
    }

    public void raise() {
        System.err.print("input raise money:");
        Scanner scanner = new Scanner(System.in);
        double raise = scanner.nextInt();
        salary = salary + raise;
        System.err.println("salary is " + salary);
    }
}


