package MacBook.usb.original;

public class Motherboard extends Original {
    public Motherboard() {
        super("Motherboard");
    }

    Original[] originals = new Original[8];

    public void addOriginal(Original or) {
        for (int i = 0; i < originals.length; i++) {
            if (originals[i] == null) {
                originals[i] = or;
                break;
            }
        }
    }

    public void motherboardStart(Motherboard motherboard) {
        motherboard.originalStatr(motherboard);
        motherboard.originalRun(motherboard);

        for (int i = 0; i < originals.length; i++) {
            if (originals[i] != null) {
                originals[i].originalStatr(originals[i]);
                originals[i].originalRun(originals[i]);
            }
        }
    }

    public void motherboardStop(Motherboard motherboard) {
        motherboard.originalStop(motherboard);

        for (int i = 0; i < originals.length; i++) {
            if (originals[i] != null) {
                originals[i].originalStop(originals[i]);
            }
        }
    }
}
