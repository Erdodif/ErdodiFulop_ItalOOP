package hu.petrik.szemely;

import hu.petrik.receptek.*;

public class Absztinens {

    public void elfogyaszt(Object barmi) {
        if (barmi instanceof Alkoholos) {
            throw new AbstinenceViolationException();
        }
    }
}
