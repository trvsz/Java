package Semester_1.Minggu_11;

public class Exercise16 {
    private int hour;
    private int minute;
    private String amPm;

    public Exercise16(int h, int m, String ap) {
        this.hour = h;
        this.minute = m;
        this.amPm = ap;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public String getAmPm() {
        return amPm;
    }
    public String toString() {
        String a;
        if (hour < 10) {
            a = "0" + hour + ":";
        } else {
            a = hour + ":";
        }
        if (minute < 10) {
            a = a + "0" +minute + " " + amPm;
        } else {
            a = a + minute + " " + amPm;
        }
        return a;
    }
    public void advance(int m) {
        if (amPm == "AM" && hour == 12) {
            hour = 0;
        } else if (amPm == "PM" && hour != 12){
            hour = hour + 12;
        }
        hour = (hour + ((minute + m) / 60)) % 24;
        minute = (minute + m) % 60;
        if (hour < 12) {
            if (hour == 0) {
                hour = hour + hour + 12;
                amPm = "AM";
            }
            else {
                if(hour > 12) {
                    hour = hour - 12;
                }
                amPm = "PM";
            }
        }
    }
    // Exercise 17
    public boolean isWorkTime() {
        if((hour >= 9 && hour <= 11 && amPm == "AM") || (((hour >=1 && ((hour < 5) || (hour == 5 && minute == 0))) || (hour == 12)) && amPm == "PM")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Exercise16 time = new Exercise16(6, 27, "PM");
        time.advance(1);
        System.out.println(time);
        time.advance(30);
        System.out.println(time);
        time.advance(5);
        System.out.println(time);
        time.advance(60);
        System.out.println(time);
        time.advance(128);
        System.out.println(time);
        time.advance(180);
        System.out.println(time);
        time.advance(1440);
        System.out.println(time);
        time.advance(21075);
        System.out.println(time);
        System.out.println();
        System.out.println("Exercise 17:");
        //Exercise 17
        Exercise16 t0 = new Exercise16(12, 45, "AM");
        System.out.println(t0.isWorkTime());
        Exercise16 t1 = new Exercise16(6, 02, "AM");
        System.out.println(t1.isWorkTime());
        Exercise16 t2 = new Exercise16(8, 59, "AM");
        System.out.println(t2.isWorkTime());
        Exercise16 t3 = new Exercise16(9, 00, "AM");
        System.out.println(t3.isWorkTime());
        Exercise16 t4 = new Exercise16(11, 38, "AM");
        System.out.println(t4.isWorkTime());
        Exercise16 t5 = new Exercise16(12, 53,  "PM");
        System.out.println(t5.isWorkTime());
        Exercise16 t6 = new Exercise16(3, 15, "PM");
        System.out.println(t6.isWorkTime());
        Exercise16 t7 = new Exercise16(4, 59, "PM");
        System.out.println(t7.isWorkTime());
        Exercise16 t8 = new Exercise16(5, 00, "PM");
        System.out.println(t8.isWorkTime());
        Exercise16 t9 = new Exercise16(5, 01, "PM");
        System.out.println(t9.isWorkTime());
        Exercise16 ta = new Exercise16(8, 30, "PM");
        System.out.println(ta.isWorkTime());
        Exercise16 tb = new Exercise16(11, 59, "PM");
        System.out.println(tb.isWorkTime());
    }
}
