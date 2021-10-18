package com.company;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("\n        Welcome to Tic Tac Toe!" + "\n     -----------------------------\n");

        Game q = new Game();
        q.Name();
        q.printBoard();
        q.play();


    }
}
