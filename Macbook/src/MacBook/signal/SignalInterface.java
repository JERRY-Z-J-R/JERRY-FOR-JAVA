package MacBook.signal;

import MacBook.usb.original.Original;

public interface SignalInterface {
    public abstract void signalStart(Original original);
    public abstract void signalRun(Original original);
    public abstract void signalStop(Original original);
}
