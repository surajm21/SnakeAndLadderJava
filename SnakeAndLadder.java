package com.bridglabz;

public class SnakeAndLadder {
    static final int no_play = 1;
    static final int ladder = 2;
    static final int snake = 3;

    public static void main(String[] args) {
        int Position = 0;
        System.out.println("Position of player at start is: " + Position);
        int rollsDie = (int) ((Math.random() * 10) % 6 + 1);
        System.out.println("Dice value = " + rollsDie);
        int playerCheck = (int) (Math.floor(Math.random() * 10) % 3) + 1;
        switch (playerCheck) {
            case no_play:
                System.out.println("No Play! Your position can not be changed,you are at :  " + Position);
                break;
            case ladder:
                Position = Position + rollsDie;
                System.out.println("Congratulation!climb up the ladder:  " + Position);
                break;
            case snake:
                Position = Position - rollsDie;
                System.out.println("Oops! swallowed by snake  :  " + Position);
                break;
            default:
                System.out.println("Something went wrong");

        }
    }
}
