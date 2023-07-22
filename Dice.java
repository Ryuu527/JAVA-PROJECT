package Boat_Racing_Assignment;

import java.util.Random;
public class Dice { // an object of this class represents one dice.
    public static Random randInt = new Random();
    public static int max = 6;
    public static int randomInteger = randInt.nextInt(max);
    public static int diceRoll = randomInteger;


    public static int getDiceRoll() {
        return diceRoll;
    }

    public static void setDiceRoll(int diceRoll) {
        Dice.diceRoll = diceRoll;
    }


}