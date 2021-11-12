package hu.petrik.szemely;

import hu.petrik.receptek.*;

public class Absztinens {

    public void elfogyaszt(Ital ital) {
        if (ital instanceof Alkoholos) {
            throw new AbstinenceViolationException();
        }
    }
}
