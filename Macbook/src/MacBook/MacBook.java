package MacBook;

import MacBook.usb.original.*;
import com.sun.xml.internal.ws.api.server.SDDocument;

import java.util.Scanner;

public class MacBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String password = "245424";

        System.out.println("\t\t\tMacBook");
        System.out.println("\t\t\tI Love Apple!");
        System.out.println("\t\t\tTo pay tribute to Steve Jobs!");
        System.out.println("\t\t\tFrom JERRY！2021/01/03 ");
        System.out.println();

        System.out.println("\t\t\tWelcome to JERRY");
        System.out.println("\t\t\tPlease enter password");

        boolean flag = true;

        while (flag) {
            System.out.print("\t\t\t>:");
            String pass = scanner.next();

            if (password.equals(pass)) {
                System.out.println("\t\t\tHi!\n");
                flag = false;
            } else {
                System.out.println("\t\t\tWrong password! please enter again");
            }
        }

        Motherboard motherboard = new Motherboard();
        CoolingSystem coolingSystem = new CoolingSystem();
        Keyboard keyboard = new Keyboard();
        M1 m1 = new M1();
        PowerSupply powerSupply = new PowerSupply();
        RAM ram = new RAM();
        ROM rom = new ROM();
        Screen screen = new Screen();
        Touchpad touchpad = new Touchpad();

        motherboard.addOriginal(coolingSystem);
        motherboard.addOriginal(keyboard);
        motherboard.addOriginal(m1);
        motherboard.addOriginal(powerSupply);
        motherboard.addOriginal(ram);
        motherboard.addOriginal(rom);
        motherboard.addOriginal(screen);
        motherboard.addOriginal(touchpad);

        motherboard.motherboardStart(motherboard);

        flag = true;
        while (flag) {
            System.out.print("\t\t\t输入'0'关机>:");
            int showDown = scanner.nextInt();
            if (showDown == 0) {
                motherboard.motherboardStop(motherboard);
                System.out.println("\t\t\tBye MacBook~");
                flag = false;
            } else {
                System.out.println("\t\t\thahaha~");
            }
        }
    }
}
