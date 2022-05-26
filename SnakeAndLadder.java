package com.bridglabz;

public class SnakeAndLadder {
    static final int no_play = 1;
    static final int ladder = 2;
    static final int snake = 3;
    static final int win = 100;
    static final int initial_position = 0;

    public static void main(String[] args) {
        int PositionOfPlayer = 0;
        System.out.println("Position of player at start is: " + PositionOfPlayer);
        int dice = 0;
        while (PositionOfPlayer <= win) {
            int rollsDie = (int) ((Math.random() * 10) % 6 + 1);
            System.out.println("Dice value = " + rollsDie);
            int playerCheck = (int) (Math.floor(Math.random() * 10) % 3) + 1;
            switch (playerCheck) {
                case no_play:
                    System.out.println("No Play! Your position can not be changed,you are at :  " + PositionOfPlayer);
                    break;
                case ladder:
                    PositionOfPlayer = PositionOfPlayer + rollsDie;
                    System.out.println("Congratulation!climb up the ladder:  " + PositionOfPlayer);
                    if (PositionOfPlayer > win) {
                        PositionOfPlayer = PositionOfPlayer + rollsDie;
                    } else if (PositionOfPlayer == win) {
                        System.out.println("you won the match");
                        System.out.println("Position Of Player :" + PositionOfPlayer);
                        System.exit(0);
                    }
                    break;
                case snake:
                    PositionOfPlayer = PositionOfPlayer - rollsDie;
                    if (PositionOfPlayer <= 0) {
                        PositionOfPlayer = initial_position;
                        System.out.println("Oops! swallowed by snake  :  " + PositionOfPlayer);
                    } else {
                        System.out.println("Oops! swallowed by snake  :  " + PositionOfPlayer);

                    }
                    break;
                default:
                    System.out.println("Something went wrong");

            }
        }

    }
}