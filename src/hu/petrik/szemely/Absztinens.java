package hu.petrik.szemely;

import hu.petrik.receptek.*;

public class Absztinens {

    public Absztinens() {

    }

    public void elfogyaszt(Ital ital) {
        if (!(ital instanceof Alkoholos)) {
            System.out.println("Elfogyaszthatja ezt az italt, mert nem alkoholos!");
        }
        else {
            throw new AbstinenceViolationException();
        }
    }
}
