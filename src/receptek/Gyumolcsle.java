package receptek;

public final class Gyumolcsle extends Gyumolcs implements Ital{

    public Gyumolcsle(Gyumolcs gy) {
        super(gy.milyenFajtaju(), gy.milyenIzu());
    }

    @Override
    public String mibolKeszult() {
        return super.toString();
    }

    @Override
    public String milyenIzu() {
        return super.milyenIzu();
    }

    @Override
    public String toString() {
        return "Gyumolcsle{" +
                    "fajta='" + super.milyenFajtaju() + '\'' +
                    ", iz='" + super.milyenIzu() + '\'' +
                    ", facsaras='" + super.toString() + '\'' +
                    '}';
    }
}