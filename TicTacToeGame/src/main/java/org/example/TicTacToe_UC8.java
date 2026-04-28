package org.example;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe_UC8 {

    static char[][] board = new char[3][3];
    static String currentPlayer;
    static char player1Symbol;
    static char player2Symbol;

    public static void main(String[] args) {
        initializeBoard();
        tossToDecideFirstPlayer();
        displayResult();

        // USER MOVE
        Scanner sc = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("Enter slot (1-9): ");
            int slot = sc.nextInt();

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col, player1Symbol);
                break;
            } else {
                System.out.println("Invalid move, try again");
            }
        }

        displayBoard();

        // COMPUTER MOVE
        computerMove();
        displayBoard();
    }

    static void computerMove() {
        Random random = new Random();
        int row, col;

        while (true) {
            int slot = random.nextInt(9) + 1;

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                System.out.println("Computer chose slot: " + slot);
                placeMove(row, col, player2Symbol);
                break;
            }
        }
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
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    static void displayBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
