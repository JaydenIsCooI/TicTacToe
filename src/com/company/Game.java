package com.company;

import java.util.Scanner;

public class Game
{
    String a = "0";
    String b = "1";
    String c = "2";
    String d = "3";
    String e = "4";
    String f = "5";
    String g = "6";
    String h = "7";
    String j = "8";
    String A = " ";
    String B = " ";
    String C = " ";
    String D = " ";
    String E = " ";
    String F = " ";
    String G = " ";
    String H = " ";
    String J = " ";
    String P1;
    String P2;
    int i = 0;
    String line = ("------------------------------------------------------------------------------");
    String numBoard = "                                                   Col:1   Col:2   Col:3\n" +
            "                                           Row 1:    " + a + "   |   " + b + "   |   " + c + "  \n" +
            "                                                   ----------------------\n" +
            "                                           Row 2:    " + d + "   |   " + e + "   |   " + f + "\n" +
            "                                                   ----------------------\n" +
            "                                           Row 3:    " + g + "   |   " + h + "   |   " + j;

    public String getBoard()
    {
        String Board = "        Col:1   Col:2   Col:3\n" +
                "Row 1:    " + A + "  |   " + B + "   |  " + C + "  \n" +
                "       ----------------------\n" +
                "Row 2:    " + D + "  |   " + E + "   |  " + F + "\n" +
                "       ----------------------\n" +
                "Row 3:    " + G + "  |   " + H + "   |  " + J;

        return Board;
    }

    public void Name()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Player 1 Name :: ");
        P1 = in.nextLine();
        System.out.print("Enter Player 2 Name :: ");
        P2 = in.nextLine();
        System.out.println(line);
    }

    public void play1()
    {
        System.out.println(numBoard);
        Scanner in = new Scanner(System.in);
        System.out.println(line);
        System.out.print(P1 + ", Enter Your Number :: ");
        String p1 = in.nextLine();
        System.out.println(line);

        if (p1.equals(a))
        {
            A = "X";
            System.out.println(getBoard());
        } else if (p1.equals(b))
        {
            B = "X";
            System.out.println(getBoard());
        } else if (p1.equals(c))
        {
            C = "X";
            System.out.println(getBoard());
        } else if (p1.equals(d))
        {
            D = "X";
            System.out.println(getBoard());
        } else if (p1.equals(e))
        {
            E = "X";
            System.out.println(getBoard());
        } else if (p1.equals(f))
        {
            F = "X";
            System.out.println(getBoard());
        } else if (p1.equals(g))
        {
            G = "X";
            System.out.println(getBoard());
        } else if (p1.equals(h))
        {
            H = "X";
            System.out.println(getBoard());
        } else if (p1.equals(j))
        {
            J = "X";
            System.out.println(getBoard());
        } else
        {
            System.out.println("That is an invalid number\n" + line);
        }
    }

    public void play2()
    {
        System.out.println(numBoard);
        System.out.println(line);
        Scanner in = new Scanner(System.in);
        System.out.print(P2 + ", Enter Your Number :: ");
        String p2 = in.nextLine();
        System.out.println(line);

        if (p2.equals(a))
        {
            A = "O";
            System.out.println(getBoard());
        } else if (p2.equals(b))
        {
            B = "O";
            System.out.println(getBoard());
        } else if (p2.equals(c))
        {
            C = "O";
            System.out.println(getBoard());
        } else if (p2.equals(d))
        {
            D = "O";
            System.out.println(getBoard());
        } else if (p2.equals(e))
        {
            E = "O";
            System.out.println(getBoard());
        } else if (p2.equals(f))
        {
            F = "O";
            System.out.println(getBoard());
        } else if (p2.equals(g))
        {
            G = "O";
            System.out.println(getBoard());
        } else if (p2.equals(h))
        {
            H = "O";
            System.out.println(getBoard());
        } else if (p2.equals(j))
        {
            J = "O";
            System.out.println(getBoard());
        } else
        {
            System.out.println("That is an invalid number\n" + line);
        }
    }

    public void getWinner()
    {
        if (A.equals("X") && B.equals("X") && C.equals("X") || D.equals("X") && E.equals("X") && F.equals("X") ||
                G.equals("X") && H.equals("X") && J.equals("X") || A.equals("X") && D.equals("X") && G.equals("X") ||
                B.equals("X") && E.equals("X") && H.equals("X") || C.equals("X") && F.equals("X") && J.equals("X") ||
                A.equals("X") && E.equals("X") && J.equals("X") || C.equals("X") && E.equals("X") && G.equals("X"))
        {
            i++;
            System.out.println(line);
            System.out.println(P1 + " Is the Winner!");
            System.out.println(line);
        }
        if (A.equals("O") && B.equals("O") && C.equals("O") || D.equals("O") && E.equals("O") && F.equals("O") ||
                G.equals("O") && H.equals("O") && J.equals("O") || A.equals("O") && D.equals("O") && G.equals("O") ||
                B.equals("O") && E.equals("O") && H.equals("O") || C.equals("O") && F.equals("O") && J.equals("O") ||
                A.equals("O") && E.equals("O") && J.equals("O") || C.equals("O") && E.equals("O") && G.equals("O"))
        {
            i++;
            System.out.println(line);
            System.out.println(P2 + " Is the Winner!");
            System.out.println(line);
        }
    }

    public void exit()
    {
        if (i == 1)
        {
            System.exit(0);
        }

    }

    public void tie()
    {
        System.out.println(line);
        System.out.println("It's a Tie!");
        System.out.println(line);
    }

}