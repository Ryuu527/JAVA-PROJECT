package Boat_Racing_Assignment;

public class Currents {

    public static int getCurrentsValue() {
        return currentsValue;
    }

    public static void setCurrentsValue(int currentsValue) {
        Currents.currentsValue = currentsValue;
    }

    private static int currentsValue;



    public static int getCurrentsType() {
        return currentsType;
    }

    public static void setCurrentsType(int currentsType) {
        Currents.currentsType = (int)(Math.random()*3) + 1;
    }

    public static int currentsType;



}
