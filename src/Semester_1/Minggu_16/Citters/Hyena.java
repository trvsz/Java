package Semester_1.Minggu_16.Citters;

// Exercise 3

public class Hyena extends Critter{
    private int moves;
    private int rect;
    private int x;
    private boolean ateFoodAlready;
    public void hyena() {
        ateFoodAlready = false;
    }
    /* Exercise 4
    public boolean eat() {
        ateFoodAlready = !ateFoodAlready;
        return true;
    } 
    */
    public Direction getMove() {
        moves++;
        /* Exercise 4
        if (ateFoodAlready) {
            moves = 1;
            ateFoodAlready = !ateFoodAlready;
            rect++;
        } 
        */
        if ((moves == 3 || moves > 4) && x <= rect) {
            moves--;
        } else {
            x = 0;
        } if (moves > 4) {
            moves = 1;
            rect++;
        } if (moves == 1) {
            return Direction.NORTH;
        } else if (moves == 2) {
            x++;
            return Direction.EAST;
        } else if (moves == 3) {
            return Direction.SOUTH;
        } else {
            x++;
            return Direction.WEST;
        }
    }
}
