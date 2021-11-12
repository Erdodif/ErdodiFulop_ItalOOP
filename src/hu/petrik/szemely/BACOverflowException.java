package hu.petrik.szemely;

public class BACOverflowException extends Exception {
    public BACOverflowException(double BAC) {
        String out = "Az illető nincs magánál";
        if (BAC > 0.5) {
            out = "Az illető meghalt";
        } else if (BAC > 0.4) {
            out = "Az illető nem lélegzik";
        }
        System.err.println("Alkoholmérgezés! " + out);
    }
    public BACOverflowException(){
        System.err.println("Alkoholmérgezés!");
    }
}
