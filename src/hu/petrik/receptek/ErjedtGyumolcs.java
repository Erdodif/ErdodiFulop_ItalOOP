package hu.petrik.receptek;

public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    protected double alkoholTartalom;

    public ErjedtGyumolcs(String f, String i, double a) {
        super(f, i);
        alkoholTartalom = a;
    }

    public double mennyiAlkoholtTartalmaz(){
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" +
                "alkoholTartalom=" + alkoholTartalom +
                ", fajta='" + super.milyenFajtaju() + '\'' +
                ", iz='" + super.milyenIzu() + '\'' +
                '}';
    }
}
