import java.time.Year;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        if (Year.of(year).isLeap()) {
            System.out.println(year + " is Leap");
        } else {
            System.out.println(year + " is not Leap");
        }
    }
}