package cxtc.jk03;
import java.util.Scanner;

abstract class Roles {
    private double attack;
    private String name;
    private String skill;

    public double getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Roles() {

    }

    public Roles(double attack, String name, String skill) {
        this.attack = attack;
        this.name = name;
        this.skill = skill;
    }
}

class DMXY extends Roles {
    public DMXY() {

    }
    public DMXY(double attack, String name, String skill) {
        super(attack, name, skill);
    }
}

class HBSS extends Roles {
    public HBSS() {

    }
    public HBSS(double attack, String name, String skill) {
        super(attack, name, skill);
    }
}

class HY extends Roles {
    public HY() {

    }
    public HY(double attack, String name, String skill) {
        super(attack, name, skill);
    }
}

class Game {
    public static Roles creatingRole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择需要创建的英雄，1、德玛西亚 2、寒冰射手 3、后羿：");
        int serialNumber = scanner.nextInt();
        switch (serialNumber) {
            case 1:
                System.out.println("德玛西亚被创建");
                return new DMXY(3.14, "德玛西亚", "德玛西亚正义");
            case 2:
                System.out.println("寒冰射手被创建");
                return new HBSS(2.99, "寒冰射手", "全球支援");
            case  3:
                System.out.println("后羿被创建");
                return new HY(3.01, "后羿", "后羿射日");
        }
        return new DMXY();
    }

    public static void releaseSkills(Roles roles) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择是否释放技能？1、释放 2、不释放：");
        int serialNumber = scanner.nextInt();
        switch (serialNumber) {
            case 1:
                System.out.println(roles.getName() + "英雄成功释放" + roles.getSkill() + "技能");
                break;
            case 2:
                System.out.println("退出结束，游戏结束");
        }
    }
}

public class HomeWork {
    public static void main(String[] args) {
        Roles roles = Game.creatingRole();
        Game.releaseSkills(roles);
    }
}
