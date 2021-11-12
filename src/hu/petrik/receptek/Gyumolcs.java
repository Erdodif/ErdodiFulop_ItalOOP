package hu.petrik.receptek;

public class Gyumolcs {
    protected String fajta;
    protected String iz;


    public Gyumolcs(String fajta, String iz) {
        this.fajta = fajta;
        this.iz = iz;
    }

    public String milyenFajtaju(){
        return this.fajta;
    }

    public String milyenIzu(){
        return this.iz;
    }

    @Override
    public String toString() {
        return "Gyumolcs{" +
                "fajta='" + fajta + '\'' +
                ", iz='" + iz + '\'' +
                '}';
    }
}
