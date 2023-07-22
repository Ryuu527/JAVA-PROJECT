package Boat_Racing_Assignment;

public class Traps {

    public static int getTrapsType() {
        return trapsType;
    }

    public static void setTrapsType(int trapsType) {

        Traps.trapsType = trapsType;
    }

    public static int trapsType;


    public void trapsTypeRand() {
        trapsType = (int)(Math.random()*3) + 1;
    }

}
