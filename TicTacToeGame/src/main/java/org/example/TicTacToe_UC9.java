package org.example;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe_UC9 {

    static char[][] board = new char[3][3];
    static char playerSymbol = 'X';
    static char computerSymbol = 'O';

    public static void main(String[] args) {

        initializeBoard();
        displayBoard();

        Scanner sc = new Scanner(System.in);

        while (true) {

            // PLAYER MOVE
            int row, col;
            while (true) {
                System.out.println("Enter slot (1-9): ");
                int slot = sc.nextInt();

                row = (slot - 1) / 3;
                col = (slot - 1) % 3;

                if (isValidMove(row, col)) {
                    board[row][col] = playerSymbol;
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
    }

    static void computerMove() {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                System.out.println("Computer chose: " + slot);
                board[row][col] = computerSymbol;
                break;
            }
        }
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
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
