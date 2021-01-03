package MacBook.usb.original;

import MacBook.usb.usb4_0.USB4_0;

public abstract class Original implements USB4_0 {
    private String equipmentName;

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public Original() {

    }

    public Original(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public void powerSupplyStart(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " PowerSupplyStart");
    }

    public void powerSupplyRun(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " PowerSupplyRun");
    }

    public void powerSupplyStop(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " PowerSupplyStop");
    }

    public void signalStart(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " SignalStart");
    }

    public void signalRun(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " SignalRun");
    }

    public void signalStop(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " SignalStop");
    }

    public void usb4_0Start(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " usb4_0Start");
    }

    public void usb4_0Run(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " usb4_0Run");
    }

    public void usb4_0Stop(Original original) {
        System.out.println("\t\t\t" + original.equipmentName + " usb4_0Stop");
    }

    public void originalStatr(Original original) {
        original.powerSupplyStart(original);
        original.signalStart(original);
        original.usb4_0Start(original);
        System.out.println();
    }

    public void originalRun(Original original) {
        original.powerSupplyRun(original);
        original.signalRun(original);
        original.usb4_0Run(original);
        System.out.println();
    }

    public void originalStop(Original original) {
        original.powerSupplyStop(original);
        original.signalStop(original);
        original.usb4_0Stop(original);
        System.out.println();
    }
}
