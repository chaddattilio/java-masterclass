package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Chad", calculateHighScorePosition(1000));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 1000) {
            return 1;
        } else {
            return 4;
        }
    }
}
