package Semester_1.Minggu_16.Citters;

// Exercise 1

public class Skunk extends Critter{
    private int moves;
    private boolean hungry;
    
    public void Skunk() {  // constructor
        hungry = false;
    }
    public  boolean eat() {
        hungry = true;
        return true;
    }
    public Direction getmoves() {
        moves++;
        if (moves > 3) {
            moves = 1;
        }
        if (moves == 1 || moves == 2) {
            return Direction.WEST;
        } else if (!hungry) {
            return Direction.NORTH;
        } else {
            return Direction.SOUTH;
        }
    }
}
