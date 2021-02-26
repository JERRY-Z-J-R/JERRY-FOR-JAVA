package cxtc.jk03;

import sun.applet.Main;

interface USB {
    public abstract void start();
    public abstract void run();
    public abstract void stop();
}

class Mouse implements USB {
    public void start() {
        System.out.println("Mouse start");
    }
    public void run() {
        System.out.println("Mouse run");
    }
    public void stop() {
        System.out.println("Mouse stop");
    }
}

class Phone implements USB {
    public void start() {
        System.out.println("Phone start");
    }
    public void run() {
        System.out.println("Phone run");
    }
    public void stop() {
        System.out.println("Phone stop");
    }
}

class MainBoard {
    public static void useUSB(USB usb) {
        usb.start();
        usb.run();
        usb.stop();
    }
}

public class HomeWork02 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Phone phone = new Phone();
        MainBoard.useUSB(mouse);
        MainBoard.useUSB(phone);
    }
}
