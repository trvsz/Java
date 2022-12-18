package Semester_1.Minggu_16.Citters;

// Exercise 5

public class Shark extends Critter {
    private int moves;
    private int x;
    public void Shark() {

    }
    public Direction getMove() {
        moves++;
        if (x < moves) {
            moves--;
        } else {
            x = 0;
        }
        x++;
        if (moves % 2 == 0) {
            return Direction.NORTH;
        } else {
            return Direction.SOUTH;
        }
    }
}
