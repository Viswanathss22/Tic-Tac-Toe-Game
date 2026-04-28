package org.example;

import java.util.Scanner;

public class TicTacToe_UC2 {

    static char[][] board = new char[3][3];
    static char userSymbol;

    public static void main(String[] args) {
        initializeBoard();
        chooseSymbol();
        displayBoard();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void chooseSymbol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose X or O:");
        userSymbol = sc.next().charAt(0);
    }

    static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}