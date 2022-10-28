package Semester_1.Minggu_08.Boolean_Logic;

public class Exercise07 {
    public static void mystery(int x, int y) {
        int z = 0;
    
        // Point A
        while (x != y) {
            // Point B
            z++;
    
            if (x > y) {
                // Point C
                x = x / 10;
            } else {
                // Point D
                y = y / 10;
            }
        }
    
        // Point E
        System.out.println(x + " " + y + " " + z);
    }
}
