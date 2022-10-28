package Semester_1.Minggu_08.Boolean_Logic;

public class Exercise06 {
    public static boolean isVowel(String s) {
        s = s.toLowerCase();
        if (s.equals("a") || s.equals("e") || s.equals("i")
                || s.equals("o") || s.equals("u")) {
            return true;
        } else {
            return false;
        }
    }
}
