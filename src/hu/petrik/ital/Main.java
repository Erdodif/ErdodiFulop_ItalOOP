package hu.petrik.ital;

import hu.petrik.szemely.Absztinens;
import hu.petrik.szemely.Iszakos;

import hu.petrik.receptek.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random  = new Random();
        Absztinens kristof = new Absztinens();
        Iszakos jacint = new Iszakos();
        List<Ital> italok = new ArrayList<>();
        List<Gyumolcs> gyumolcsok = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Hányszor vendégelnéd meg barátainkkat?");
        int hanyszor = sc.nextInt();
        while (hanyszor!=0){
            try {
                kristof.elfogyaszt(italok.get(random.nextInt(italok.size()-1)));
                kristof.elfogyaszt(gyumolcsok.get(random.nextInt(gyumolcsok.size()-1)));
                hanyszor++;
            }
            catch (Exception e){
                System.out.println("Hiba: "+e.getMessage());
            }
        }
        System.out.println("Bezártunk.");

    }




}
