package hu.petrik.szemely;

import hu.petrik.receptek.Alkoholos;
import hu.petrik.receptek.Gyumolcs;

import java.util.Random;

public class Iszakos {
    private final Random random = new Random();
    protected double turesHatar;
    protected double alkoholSzint;

    public Iszakos(double turesHatar) {
        this.alkoholSzint = 0;
        this.turesHatar = turesHatar;
    }

    public Iszakos() {
        this.alkoholSzint = 0;
        this.turesHatar = Math.random() * 0.3 + 0.16;
    }

    public void Elfogyaszt(Object barmi, double menyiseg) throws BACOverflowException {
        if (barmi instanceof Alkoholos) {
            this.alkoholSzint += ((Alkoholos) barmi).mennyiAlkoholtTartalmaz() * menyiseg / 2;
            if (this.alkoholSzint > 0.3) {
                throw new BACOverflowException(this.alkoholSzint);
            }
        }
    }

    public Integer mennyitMutatok(int u) {
        Integer tipp = u;
        if (this.alkoholSzint > 0.3) {
            tipp = null;
        } else if (alkoholSzint > 0.06) {
            if (random.nextBoolean()) {
                u *= -1;
            }
            tipp *= (int) Math.round(Math.random() * (u * alkoholSzint * 5) + u);
        }
        return tipp;
    }
}
