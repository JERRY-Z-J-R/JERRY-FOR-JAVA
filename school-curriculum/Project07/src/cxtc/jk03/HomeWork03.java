package cxtc.jk03;

class NonMotorVehicle {
    public String brand;
    public String colour;
    public int wheel = 2;
    public int seat = 1;

    public NonMotorVehicle() {
    }

    public NonMotorVehicle(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    public NonMotorVehicle(String brand, String colour, int wheel, int seat) {
        this.brand = brand;
        this.colour = colour;
        this.wheel = wheel;
        this.seat = seat;
    }

    public void listAttributes() {
        System.out.println("这是一辆" + colour + "颜色，" + brand + "牌子的非机动车，" + "有" + wheel + "个轮子，有" + seat + "个座椅");
    }
}

class Bicycle extends NonMotorVehicle {
    public Bicycle() {
    }

    public Bicycle(String brand, String colour) {
        super(brand, colour);
    }

    public void listAttributes() {
        System.out.println("这是一辆" + colour +"颜色，" + brand + "牌的自行车");
    }
}

class ElectricCar extends NonMotorVehicle {
    public String batteryBrand = "飞鹤";

    public void listAttributes() {
        System.out.println("这是一辆使用" + batteryBrand + "牌电池的电动车");
    }
}

class Tricycle extends NonMotorVehicle {
    public Tricycle() {
        wheel = 3;
    }

    public void listAttributes() {
        System.out.println("三轮车是一款有" + wheel + "个轮子的非机动车");
    }
}

public class HomeWork03 {
    public static void main(String[] args) {
        NonMotorVehicle car1 = new NonMotorVehicle("天宇", "红", 4, 2);
        car1.listAttributes();
        Bicycle car2 = new Bicycle("捷安特", "黄");
        car2.listAttributes();
        ElectricCar car3 = new ElectricCar();
        car3.listAttributes();
        Tricycle car4 = new Tricycle();
        car4.listAttributes();
    }
}
