package receptek;

public class Bor extends AlkoholosItal{
    private String szolloFajta;
    private String termoTerulet;

    public Bor(String sz, String t, String i, double a){
        super(i,a);
        this.szolloFajta = sz;
        this.termoTerulet = t;
    }

    public Bor(Gyumolcs gy, String t, double a){
        super(gy.milyenIzu(),a);
        this.szolloFajta = gy.milyenFajtaju();
        this.termoTerulet = t;
    }

    public String hotTermelt(){
        return this.termoTerulet;
    }

    @Override
    public String milyenIzu() {
        return super.milyenIzu();
    }

    @Override
    public String mibolKeszult() {
        return this.szolloFajta;
    }

    @Override
    public String toString() {
        return "Bor{" +
                "szolloFajta='" + szolloFajta + '\'' +
                ", termoTerulet='" + termoTerulet + '\'' +
                "iz='" + super.milyenIzu() + '\'' +
                ", alkoholTartalom=" + super.mennyiAlkoholtTartalmaz() +
                '}';
    }
}
