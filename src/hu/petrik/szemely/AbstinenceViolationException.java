package hu.petrik.szemely;

public class AbstinenceViolationException extends RuntimeException{

    public AbstinenceViolationException() {
        System.out.println("Nem engedheti meg magának, hogy alkoholt fogyasszon!");
    }
}
