package org.example;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe_UC4 {

    static char[][] board = new char[3][3];
    static String currentPlayer;
    static char player1Symbol;
    static char player2Symbol;

    public static void main(String[] args) {
        initializeBoard();
        tossToDecideFirstPlayer();
        displayResult();

        int slot = getUserInput();
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void tossToDecideFirstPlayer() {
        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }
    }

    static void displayResult() {
        System.out.println(currentPlayer + " starts first");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }

    static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter slot number (1-9): ");
        return sc.nextInt();
    }
}
