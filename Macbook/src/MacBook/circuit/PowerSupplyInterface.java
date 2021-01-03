package MacBook.circuit;

import MacBook.usb.original.Original;

public interface PowerSupplyInterface {
    public static final double VOLTAGE = 5.0;
    public static final double CURRENT = 0.5;

    public abstract void powerSupplyStart(Original original);
    public abstract void powerSupplyRun(Original original);
    public abstract void powerSupplyStop(Original original);
}
