package MacBook.usb.usb4_0;

import MacBook.circuit.PowerSupplyInterface;
import MacBook.signal.SignalInterface;
import MacBook.usb.original.Original;

public interface USB4_0 extends PowerSupplyInterface, SignalInterface {
    public abstract void usb4_0Start(Original original);
    public abstract void usb4_0Run(Original original);
    public abstract void usb4_0Stop(Original original);
}
