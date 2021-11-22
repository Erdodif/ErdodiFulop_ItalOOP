package hu.petrik.ital;

import hu.petrik.szemely.Absztinens;
import hu.petrik.szemely.Iszakos;

import hu.petrik.receptek.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Random random = new Random();
    protected static List<Ital> italok;
    protected static List<Gyumolcs> gyumolcsok;
    protected static List<Absztinens> szemelyek;

    private static void alkoholteszt(Iszakos szemely){
        int ujjak = random.nextInt(5)+1;
        System.out.println("Alkoholteszt: hányat mutatok? ("+ujjak+")");
        System.out.println("Tipp: "+szemely.mennyitMutatok(ujjak));
    }

    private static void italtKinal(Ital i, Absztinens szemely){
        try {
            System.out.println(szemely.getNev() + " meg lett kínálva egy pohárnyi ilyennel: " +
                    i.toString());
            if (szemely instanceof Iszakos) {
                ((Iszakos) szemely).elfogyaszt(i, 0.25);
                alkoholteszt((Iszakos) szemely);
            } else {
                szemely.elfogyaszt(i);
            }
            System.out.println("Elfogyasztotta");
        } catch (Exception e) {
            System.out.println("Nem fogyasztotta el");
        }
    }

    private static void gyumolcsKinal(Gyumolcs gy, Absztinens szemely){
        try {
            System.out.println(szemely.getNev() + " meg lett kínálva ezzel a gyümölccsel: " +
                    gy.toString());
            if (szemely instanceof Iszakos) {
                ((Iszakos) szemely).elfogyaszt(gy, 0.25);
                alkoholteszt((Iszakos) szemely);
            } else {
                szemely.elfogyaszt(gy);
            }
            System.out.println("Elfogyasztotta");
        } catch (Exception e) {
            System.out.println("Nem fogyasztotta el");
        }
    }

    private static void init() {
        italok = new ArrayList<>();
        gyumolcsok = new ArrayList<>();
        szemelyek = new ArrayList<>();

        italok.add(new Gyumolcsle(new Gyumolcs("Narancs", "Sárga")));
        gyumolcsok.add(new Gyumolcs("Narancs", "Sárga"));
        italok.add(new Gyumolcsle(new Gyumolcs("idared", "édes")));
        gyumolcsok.add(new Gyumolcs("idared", "édes"));

        italok.add(new Bor(new Gyumolcs("Fehér szőlő", "édes"), "Balaton", 0.12));
        gyumolcsok.add(new ErjedtGyumolcs("idared","kesernyés",0.2));

        szemelyek.add(new Absztinens("Kristóf"));
        szemelyek.add(new Iszakos("Jácint"));
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hányszor vendégelnéd meg barátainkkat?");
        int hanyszor = sc.nextInt();
        for (int i = 0; i < hanyszor; i++) {
            for (Absztinens szemely : szemelyek) {
                int index = random.nextInt(italok.size());
                italtKinal(italok.get(index),szemely);
                index = random.nextInt(gyumolcsok.size());
                gyumolcsKinal(gyumolcsok.get(index),szemely);
            }
        }
        System.out.println("Bezártunk.");

    }


}
