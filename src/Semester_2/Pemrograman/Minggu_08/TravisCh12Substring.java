package Semester_2.Pemrograman.Minggu_08;

// Travis Zusa Zuve Saputra
// 22537141013

public class TravisCh12Substring {
    public static void main(String[] args) {
        System.out.println(substring("hello", 0, 2));
        System.out.println(substring("hamburger", 4, 8));
        System.out.println(substring("howdy", 3, 3));
    }
    public static String substring(String str, int start, int end) {
        if (start < 0 || end < 0 || start > end || end > str.length()) { // length() hanya untuk syarat agar tidak error
            throw new IllegalArgumentException();
        } else if (start == end) {
            return "";
        } else {
            return str.substring(start, end);
        }
    }
}

/*
he
urge

*/