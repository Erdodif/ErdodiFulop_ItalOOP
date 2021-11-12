package hu.petrik.receptek;

public class Aszu extends Bor{
    protected int puttonySzam;

    public Aszu(int p,String t, double a) {
        super("aszu", t, null, a);
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" +
                "puttonySzam=" + puttonySzam +
                ", szolloFajta='" + super.mibolKeszult() + '\'' +
                ", termoTerulet='" + super.hotTermelt() + '\'' +
                ", iz='" + super.milyenIzu() + '\'' +
                ", alkoholTartalom=" + super.mennyiAlkoholtTartalmaz() +
                '}';
    }
}
