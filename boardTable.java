package Boat_Racing_Assignment;

import java.util.Random;

public class boardTable {

    public static int CurrentNTraps2 = 0;
    public static int Player2Position = 0;
    public static int CurrentNTraps = 0;
    public static int PlayerPosition = 0;
    public static int position;
    public static boolean Player1Wins = false;
    public static boolean getCheckWin;
    public static int P2Position = 1;
    public static int P1Position = 1;

    public static int getPlayer2Position() {
        return PlayerPosition;
    }

    public static void setPlayer2Position(int Player2Position) {
        boardTable.Player2Position = Player2Position;
    }

    public static int getPlayerPosition() {
        return PlayerPosition;
    }

    public static void setPlayerPosition(int PlayerPosition) {
        boardTable.PlayerPosition = PlayerPosition;
    }

    public static int getP2Position() {
        return P2Position;
    }

    public static void setP2Position(int p2Position) {
        P2Position = p2Position;
    }

    public static int getP1Position() {
        return P1Position;
    }

    public static void setP1Position(int p1Position) {
        P1Position = p1Position;
    }

    public static void boardGame() {


        int[][] table = new int[10][10];
        for (int i = 0, j = 0; i < 10; i++) {
            j += 1;
            table[0][i] = j;
        }
        for (int i = 0, j = 21; i < 10; i++) {
            j -= 1;
            table[1][i] = j;
        }
        for (int i = 0, j = 20; i < 10; i++) {
            j += 1;
            table[2][i] = j;
        }
        for (int i = 0, j = 41; i < 10; i++) {
            j -= 1;
            table[3][i] = j;
        }
        for (int i = 0, j = 40; i < 10; i++) {
            j += 1;
            table[4][i] = j;
        }
        for (int i = 0, j = 61; i < 10; i++) {
            j -= 1;
            table[5][i] = j;
        }
        for (int i = 0, j = 60; i < 10; i++) {
            j += 1;
            table[6][i] = j;
        }
        for (int i = 0, j = 81; i < 10; i++) {
            j -= 1;
            table[7][i] = j;
        }
        for (int i = 0, j = 80; i < 10; i++) {
            j += 1;
            table[8][i] = j;
        }
        for (int i = 0, j = 101; i < 10; i++) {
            j -= 1;
            table[9][i] = j;
        }


        System.out.println();
        System.out.println("| ⚓START HERE⚓ |");
        System.out.print("\uD83C\uDF0A︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵\uD83C\uDF0A");
        System.out.println();

        int inc = 3;
        int row;
        int column;
        int once = 0;
        Random rand = new Random();

        for (row = 0; row < table.length; row++) {
            System.out.print(" ");
            for (column = 0; column < table.length; column++) {
                String Current = "\uD83C\uDF0A";
                String Traps = "\uD83C\uDF2A";

                String rightSpace = " _";
                String leftSpace = "_ ";
                String a;
                inc++;
                String finish = "\uD83C\uDFC1";

                //to generate currents, traps, players, finish line.


                //created the print player, will increase as game moves on.
                //Create the condition, to only print until 100, then stop.

                //generate currents as sea emoji

                //declare variable to refer to the current class.


                if (Currents.getCurrentsType() == 0) {
                    if (row == 0 && column == 1 || row == 5 && column == 1 || row == 1 && column == 2 || row == 2 && column == 2 || row == 3 && column == 0 || row == 8 && column == 0 || row == 9 && column == 0 || row == 10 && column == 1) {
                        rightSpace = Current;
                        leftSpace = Current;
                    }
                }
                if (Currents.getCurrentsType() == 1) {
                    if (row == 0 && column == 9 || row == 1 && column == 0 || row == 0 && column == 3 || row == 0 && column == 2 || row == 3 && column == 0 || row == 4 && column == 4 || row == 8 && column == 6 || row == 10 && column == 0) {
                        rightSpace = Current;
                        leftSpace = Current;
                    }

                }
                if (Currents.getCurrentsType() == 2) {
                    if (row == 0 && column == 3 || row == 1 && column == 3 || row == 5 && column == 0 || row == 8 && column == 1 || row == 3 && column == 8 || row == 5 && column == 5 || row == 6 && column == 4 || row == 9 && column == 9) {
                        rightSpace = Current;
                        leftSpace = Current;
                    }

                }
                if (Currents.getCurrentsType() == 3) {
                    if (row == 3 && column == 4 || row == 2 && column == 3 || row == 2 && column == 1 || row == 2 && column == 7 || row == 7 && column == 0 || row == 8 && column == 2 || row == 9 && column == 3 || row == 1 && column == 8) {
                        rightSpace = Current;
                        leftSpace = Current;
                    }

                }


                //generate traps as tornado


                if (Currents.getCurrentsType() == 0) {
                    if (row == 5 && column == 9 || row == 0 && column == 9 || row == 1 && column == 3 || row == 2 && column == 6 || row == 7 && column == 4 || row == 8 && column == 9 || row == 9 && column == 3 || row == 10 && column == 8) {
                        rightSpace = Traps;
                        leftSpace = Traps;
                    }
                }
                if (Currents.getCurrentsType() == 1) {
                    if (row == 0 && column == 2 || row == 0 && column == 1 || row == 1 && column == 1 || row == 2 && column == 3 || row == 7 && column == 5 || row == 8 && column == 1 || row == 9 && column == 2 || row == 10 && column == 1) {
                        rightSpace = Traps;
                        leftSpace = Traps;
                    }
                }
                if (Currents.getCurrentsType() == 2) {
                    if (row == 0 && column == 9 || row == 1 && column == 1 || row == 1 && column == 3 || row == 2 && column == 2 || row == 3 && column == 4 || row == 4 && column == 9 || row == 8 && column == 3 || row == 10 && column == 0) {
                        rightSpace = Traps;
                        leftSpace = Traps;
                    }
                }
                if (Currents.getCurrentsType() == 3) {
                    if (row == 0 && column == 4 || row == 5 && column == 9 || row == 7 && column == 3 || row == 8 && column == 6 || row == 7 && column == 8 || row == 4 && column == 1 || row == 9 && column == 4 || row == 9 && column == 9) {
                        rightSpace = Traps;
                        leftSpace = Traps;
                    }
                }


                //generate players to first index

                if (column == 0 && row == 0) {
                    rightSpace = Players.getPlayer1();
                    leftSpace = Players.getPlayer2();
                }


                //generate flags to last index.

                if (column == 0 && row == 9) {
                    rightSpace = finish;
                    leftSpace = finish;
                }





/*
                for(int i = 0, j = 0, k = 0; i < 100; i ++) {
                    position = i;
                    if (Menu.getPlayer1Position() == position && rightSpace.equals(Current)) {
                        int max = 6, min = 1;
                        int currentVal = rand.nextInt(max + 1 - min) + min;
                        int totalNewVal = Menu.getPlayer1Position() + currentVal;
                        Menu.setPlayer1Position(totalNewVal);
                    }
                    if (Menu.getPlayer1Position() == position && rightSpace.equals(Traps)) {
                        int max = 6, min = 1;
                        int trapsVal = rand.nextInt(max + 1 - min) + min;
                        int totalNewVal = Menu.getPlayer1Position() - trapsVal;
                        Menu.setPlayer1Position(totalNewVal);
                    }
                    if (Menu.getPlayer1Position() == position && column == k && row == j) {
                        if (k %10 == 0 ) {
                            k = 0 ;
                            j ++;
                        } else {
                            rightSpace = Players.getPlayer1();
                            System.out.print(column);
                            k++;
                        }
                    }
                    if (Menu.getPlayer1Position() == 100) {
                        Player1Wins = true;
                    }
                }



                System.out.print(Menu.getPlayer1Position());


 */


                //TEst

                /*
                for ( int i = 1, p = 1; i < 10; i ++ ) {
                    position = p;
                    if (PlayerPosition == position) {
                        if (column == i && row == 0 && rightSpace == Current && leftSpace == Current) {
                            int max = 6;
                            int randomInteger1 = rand.nextInt(max);
                            PlayerPosition += randomInteger1;
                        }
                        if (PlayerPosition == position && column == i && row == 0) {
                            rightSpace = Players.getPlayer1();
                        }
                    }
                    i++;
                    p++;
                }
                */

                /*
                for ( int i = 0, j = 0 ; i <=9 ; i ++) {
                    position = i;
                    if (PlayerPosition == position) {
                        if (column == i && row == 0 && rightSpace == Current && leftSpace == Current) {
                            int max = 6;
                            int randomInteger1 = rand.nextInt(max);
                            PlayerPosition += randomInteger1;
                        }
                        if (column == i && row == 0 && rightSpace == Traps && leftSpace == Traps) {
                            PlayerPosition -= 1;
                            i = 0;
                        }
                        if (column == i && row == 0 && PlayerPosition == position) {
                            rightSpace = Players.getPlayer1();
                        }
                    }
                }

                 */


                if ((column == 0) && (row == 0) && Menu.isPlayer1Turn() ) {
                    int max = 6;
                    int value = rand.nextInt(max);

                    PlayerPosition += value;
                    PlayerPosition += CurrentNTraps;
                    CurrentNTraps = 0;

                }



                position = 1;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 2;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 3;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 4;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 5;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 5 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 6;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 7;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 8;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 9;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 9 && row == 0) {
                        rightSpace = Players.getPlayer1();
                    }
                }


                position = 10;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 9 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }


                position = 11;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 12;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 13;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 14;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 5 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 15;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 16;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 17;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 18;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 19;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 1) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 20;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 21;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 22;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 23;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 24;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 25;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 5 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 26;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 27;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 28;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 29;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 9 && row == 2) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 30;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 9 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }


                position = 31;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 32;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 33;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 34;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 5 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 35;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 3;
                    }
                    if (PlayerPosition == position && column == 4 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 36;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 37;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 38;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        PlayerPosition += randomInteger1;
                    }
                    if (column == 1 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 39;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        PlayerPosition += randomInteger1;
                    }
                    if (column == 0 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 3) {
                        rightSpace = Players.getPlayer1();
                    }
                }


                position = 40;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 41;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 42;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 43;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 44;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 45;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 5 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 46;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 47;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 48;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 49;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 9 && row == 4) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 50;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 9 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }


                position = 51;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 52;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 53;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 54;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 5 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 55;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 56;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 57;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 58;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 59;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 5) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 60;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 61;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 62;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 63;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 64;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 65;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 5 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 66;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 67;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 68;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 69;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 9 && row == 6) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 70;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 9 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 71;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 72;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 73;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 74;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 5 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 75;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 76;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 77;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 78;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 79;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 7) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 80;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 81;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 82;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 83;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 84;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 85;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 5 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 86;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 87;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 88;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 89;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps -= randomInteger2;
                    }
                    if (PlayerPosition == position && column == 9 && row == 8) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 90;
                if (PlayerPosition == position) {
                    if (column == 9 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 9 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 9 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 91;
                if (PlayerPosition == position) {
                    if (column == 8 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 8 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 8 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 92;
                if (PlayerPosition == position) {
                    if (column == 7 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 7 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 7 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 93;
                if (PlayerPosition == position) {
                    if (column == 6 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 6 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 6 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }
                position = 94;
                if (PlayerPosition == position) {
                    if (column == 5 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 5 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 5 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 95;
                if (PlayerPosition == position) {
                    if (column == 4 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 4 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 4 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 96;
                if (PlayerPosition == position) {
                    if (column == 3 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 3 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 3 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 97;
                if (PlayerPosition == position) {
                    if (column == 2 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 2 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 2 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 98;
                if (PlayerPosition == position) {
                    if (column == 1 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 1 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 1 && row == 9) {
                        rightSpace = Players.getPlayer1();
                    }
                }

                position = 99;
                if (PlayerPosition == position) {
                    if (column == 0 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps += randomInteger1;
                    }
                    if (column == 0 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps -= 1;
                    }
                    if (PlayerPosition == position && column == 0 && row == 9) {
                        rightSpace = Players.getPlayer1();

                    }
                }


                if (PlayerPosition >= 100 && column == 0 && row == 9) {
                    rightSpace = Players.getPlayer1();
                }

                if (Menu.getCount() == 0) {
                    rightSpace = rightSpace;
                    PlayerPosition = 0;
                }


                /*
                //test
                int s = 1;
                int u = 0;
                if (column==s && row == u ) {
                    rightSpace = Players.getPlayer1();

                }
                 */


                //for player 2



                Random rand12 = new Random();
                if (column == 0 && row == 0 && Menu.isPlayer2Turn()) {
                    int max = 6;
                    int value2 = rand12.nextInt(max);
                    Player2Position += value2;
                    Player2Position += CurrentNTraps2;
                    CurrentNTraps2 = 0;
                }


                position = 1;
                if (Player2Position == position) {
                    if (column == 1 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 2;
                if (Player2Position == position) {
                    if (column == 2 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 3;
                if (Player2Position == position) {
                    if (column == 3 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 4;
                if (Player2Position == position) {
                    if (column == 4 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 5;
                if (Player2Position == position) {
                    if (column == 5 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                }
                if (Player2Position == position && column == 5 && row == 0) {
                    rightSpace = Players.getPlayer1();
                }


                position = 6;
                if (Player2Position == position) {
                    if (column == 6 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 7;
                if (Player2Position == position) {
                    if (column == 7 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 8;
                if (Player2Position == position) {
                    if (column == 8 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 9;
                if (Player2Position == position) {
                    if (column == 9 && row == 0 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 0 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 9 && row == 0) {
                        leftSpace = Players.getPlayer2();
                    }
                }


                position = 10;
                if (Player2Position == position) {
                    if (column == 9 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 9 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }


                position = 11;
                if (Player2Position == position) {
                    if (column == 8 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 12;
                if (Player2Position == position) {
                    if (column == 7 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 13;
                if (Player2Position == position) {
                    if (column == 6 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 14;
                if (Player2Position == position) {
                    if (column == 5 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 5 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 15;
                if (Player2Position == position) {
                    if (column == 4 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 16;
                if (Player2Position == position) {
                    if (column == 3 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 17;
                if (Player2Position == position) {
                    if (column == 2 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 18;
                if (Player2Position == position) {
                    if (column == 1 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 19;
                if (Player2Position == position) {
                    if (column == 0 && row == 1 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 1 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 1) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 20;
                if (Player2Position == position) {
                    if (column == 0 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 21;
                if (Player2Position == position) {
                    if (column == 1 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 22;
                if (Player2Position == position) {
                    if (column == 2 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 23;
                if (Player2Position == position) {
                    if (column == 3 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 24;
                if (Player2Position == position) {
                    if (column == 4 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 25;
                if (Player2Position == position) {
                    if (column == 5 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 5 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 26;
                if (Player2Position == position) {
                    if (column == 6 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 27;
                if (Player2Position == position) {
                    if (column == 7 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 28;
                if (Player2Position == position) {
                    if (column == 8 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 29;
                if (Player2Position == position) {
                    if (column == 9 && row == 2 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 2 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 9 && row == 2) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 30;
                if (Player2Position == position) {
                    if (column == 9 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 9 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }


                position = 31;
                if (Player2Position == position) {
                    if (column == 8 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 32;
                if (Player2Position == position) {
                    if (column == 7 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 33;
                if (Player2Position == position) {
                    if (column == 6 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 34;
                if (Player2Position == position) {
                    if (column == 5 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 5 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 35;
                if (Player2Position == position) {
                    if (column == 4 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 3;
                    }
                    if (Player2Position == position && column == 4 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 36;
                if (Player2Position == position) {
                    if (column == 3 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 37;
                if (Player2Position == position) {
                    if (column == 2 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 38;
                if (Player2Position == position) {
                    if (column == 1 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        Player2Position += randomInteger1;
                    }
                    if (column == 1 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 39;
                if (Player2Position == position) {
                    if (column == 0 && row == 3 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        Player2Position += randomInteger1;
                    }
                    if (column == 0 && row == 3 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 3) {
                        leftSpace = Players.getPlayer2();
                    }
                }


                position = 40;
                if (Player2Position == position) {
                    if (column == 0 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 41;
                if (Player2Position == position) {
                    if (column == 1 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 42;
                if (Player2Position == position) {
                    if (column == 2 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 43;
                if (Player2Position == position) {
                    if (column == 3 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 44;
                if (Player2Position == position) {
                    if (column == 4 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 45;
                if (Player2Position == position) {
                    if (column == 5 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 5 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 46;
                if (Player2Position == position) {
                    if (column == 6 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 47;
                if (Player2Position == position) {
                    if (column == 7 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 48;
                if (Player2Position == position) {
                    if (column == 8 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 49;
                if (Player2Position == position) {
                    if (column == 9 && row == 4 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 4 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 9 && row == 4) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 50;
                if (Player2Position == position) {
                    if (column == 9 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 9 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }


                position = 51;
                if (Player2Position == position) {
                    if (column == 8 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 52;
                if (Player2Position == position) {
                    if (column == 7 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 53;
                if (Player2Position == position) {
                    if (column == 6 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 54;
                if (Player2Position == position) {
                    if (column == 5 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 5 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 55;
                if (Player2Position == position) {
                    if (column == 4 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 56;
                if (Player2Position == position) {
                    if (column == 3 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 57;
                if (Player2Position == position) {
                    if (column == 2 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 58;
                if (Player2Position == position) {
                    if (column == 1 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 59;
                if (Player2Position == position) {
                    if (column == 0 && row == 5 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 5 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 5) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 60;
                if (Player2Position == position) {
                    if (column == 0 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 61;
                if (Player2Position == position) {
                    if (column == 1 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 62;
                if (Player2Position == position) {
                    if (column == 2 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 63;
                if (Player2Position == position) {
                    if (column == 3 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 64;
                if (Player2Position == position) {
                    if (column == 4 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 65;
                if (Player2Position == position) {
                    if (column == 5 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 5 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 66;
                if (Player2Position == position) {
                    if (column == 6 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 67;
                if (Player2Position == position) {
                    if (column == 7 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 68;
                if (Player2Position == position) {
                    if (column == 8 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 69;
                if (Player2Position == position) {
                    if (column == 9 && row == 6 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 6 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 9 && row == 6) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 70;
                if (Player2Position == position) {
                    if (column == 9 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 9 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 71;
                if (Player2Position == position) {
                    if (column == 8 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 72;
                if (Player2Position == position) {
                    if (column == 7 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 73;
                if (Player2Position == position) {
                    if (column == 6 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 74;
                if (Player2Position == position) {
                    if (column == 5 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 5 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 75;
                if (Player2Position == position) {
                    if (column == 4 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 76;
                if (Player2Position == position) {
                    if (column == 3 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 77;
                if (Player2Position == position) {
                    if (column == 2 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 78;
                if (Player2Position == position) {
                    if (column == 1 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 79;
                if (Player2Position == position) {
                    if (column == 0 && row == 7 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 7 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 7) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 80;
                if (Player2Position == position) {
                    if (column == 0 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 81;
                if (Player2Position == position) {
                    if (column == 1 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 82;
                if (Player2Position == position) {
                    if (column == 2 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 83;
                if (Player2Position == position) {
                    if (column == 3 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 84;
                if (Player2Position == position) {
                    if (column == 4 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 85;
                if (Player2Position == position) {
                    if (column == 5 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 5 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 86;
                if (Player2Position == position) {
                    if (column == 6 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger1;
                    }
                    if (Player2Position == position && column == 6 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 87;
                if (Player2Position == position) {
                    if (column == 7 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger1;
                    }
                    if (Player2Position == position && column == 7 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 88;
                if (Player2Position == position) {
                    if (column == 8 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger1;
                    }
                    if (Player2Position == position && column == 8 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 89;
                if (Player2Position == position) {
                    if (column == 9 && row == 8 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 8 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        int max = 6;
                        int randomInteger2 = rand.nextInt(max);
                        CurrentNTraps2 -= randomInteger2;
                    }
                    if (Player2Position == position && column == 9 && row == 8) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 90;
                if (Player2Position == position) {
                    if (column == 9 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 9 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 9 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 91;
                if (Player2Position == position) {
                    if (column == 8 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 8 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 8 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 92;
                if (Player2Position == position) {
                    if (column == 7 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 7 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 7 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 93;
                if (Player2Position == position) {
                    if (column == 6 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 6 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 6 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }
                position = 94;
                if (Player2Position == position) {
                    if (column == 5 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 5 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 5 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 95;
                if (Player2Position == position) {
                    if (column == 4 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 4 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 4 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 96;
                if (Player2Position == position) {
                    if (column == 3 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 3 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 3 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 97;
                if (Player2Position == position) {
                    if (column == 2 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 2 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 2 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 98;
                if (Player2Position == position) {
                    if (column == 1 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 1 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 1 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }

                position = 99;
                if (Player2Position == position) {
                    if (column == 0 && row == 9 && rightSpace.equals(Current) && leftSpace.equals(Current)) {
                        int max = 6;
                        int randomInteger1 = rand.nextInt(max);
                        CurrentNTraps2 += randomInteger1;
                    }
                    if (column == 0 && row == 9 && rightSpace.equals(Traps) && leftSpace.equals(Traps)) {
                        CurrentNTraps2 -= 1;
                    }
                    if (Player2Position == position && column == 0 && row == 9) {
                        leftSpace = Players.getPlayer2();
                    }
                }


                if (Player2Position >= 100 && column == 0 && row == 9) {
                    leftSpace = Players.getPlayer2();
                }

                if (Menu.getCount() == 0) {
                    Player2Position = 0;
                    leftSpace = leftSpace;
                }


            //LETS GOOOOOOO!!, finally created it after 10 hours.
            //moving player.

            //if user cliked a in menu class, loop to print board, and when user press m, initiate roll dice + move forward according to dice roll + current position
            //since we reprint this board, the board should not reprint currents and traps, and should print new player position.
            // so, 1st time print, random, and starting and finish line
            // second time, print new position of player 1, and same traps and currents positions.

                /*

                if (Menu.getCount() >= 1) {
                    Dice dice1;
                    dice1 = new Dice();
                    dice1.roll();
                    int diceValue = dice1.getDice();
                    System.out.print(diceValue);
                    int playerPosition = boardTable.getP1Position();
                    if (table[row][column] == playerPosition) {
                        playerPosition = playerPosition + diceValue;
                        rightSpace = Players.getPlayer1();
                        setP1Position(playerPosition);
                    }
                }
                 */


            a = rightSpace + "`" + leftSpace;
            System.out.print("");
            System.out.print("{");
            System.out.print(a);
            System.out.print("}");
            System.out.print("  ");
        }

        System.out.print("\n");
        System.out.print("⚓︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵⚓");
        System.out.println("  ");


    }
        System.out.print("| \uD83C\uDFC1 FINISH LINE \uD83C\uDFC1 |");
        System.out.println("\n");
}

}
