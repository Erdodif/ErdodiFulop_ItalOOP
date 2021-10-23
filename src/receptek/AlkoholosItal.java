package receptek;

public abstract class AlkoholosItal implements Ital, Alkoholos{
    private final String iz;
    private final double alkoholTartalom;

    public AlkoholosItal(String i, double a){
        this.iz = i;
        this.alkoholTartalom = a;
    }

    public double mennyiAlkoholtTartalmaz(){
        return this.alkoholTartalom;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" +
                "iz='" + iz + '\'' +
                ", alkoholTartalom=" + alkoholTartalom +
                '}';
    }
}
