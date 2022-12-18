package Semester_1.Minggu_16.Citters;

// Exercise 2

import java.awt.*;

public class Butterfly extends Critter{
    private int moves;
    public Butterfly() {

    }
    public Color getColor() {
        return Color.YELLOW;
    }
    public Direction getMove(){
        moves++;
        if (moves > 4) {
            moves = 1;
        } if (moves == 1 || moves == 3) {
            return Direction.NORTH;
        } else if (moves == 2) {
            return Direction.WEST;
        } else {
            return Direction.EAST;
        }
    }
    public String toString() {
        if (moves % 2 == 1) {
            return "-";
        } else {
            return "x";
        }
    }
}
