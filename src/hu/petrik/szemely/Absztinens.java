package hu.petrik.szemely;

import hu.petrik.receptek.*;

public class Absztinens {
    protected String nev;

    public Absztinens(String nev){
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void elfogyaszt(Object barmi) {
        if (barmi instanceof Alkoholos) {
            throw new AbstinenceViolationException();
        }
    }
}
