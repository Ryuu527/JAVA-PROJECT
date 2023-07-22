package Boat_Racing_Assignment;

public class GamePlay {
    public static int setMovePlayer;
    public boolean gameWon;
    public String currentPlayerTurn = "p1";
    public String currentPlayerName;
    private static int movePlayer;


    public boolean isGameWon() {
        return gameWon;
    }

    public void setGameWon() {
        this.gameWon = gameWon;
    }

    public String getCurrentPlayerTurn() {
        return currentPlayerTurn;
    }

    public void setCurrentPlayerTurn(String currentPlayerTurn) {
        currentPlayerTurn += "p1";
    }

    public void setCurrentPlayerName(String currentPlayerName) {
        this.currentPlayerName = currentPlayerName;
    }

    public String getCurrentsPlayerName() {
        return currentPlayerName;
    }

    public static int getMovePlayer() {
        return movePlayer;
    }

    public void setMovePlayer(int movePlayer) {
        this.movePlayer = movePlayer;
    }
}
