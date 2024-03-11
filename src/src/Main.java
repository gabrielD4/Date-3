import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dayOfTheWeek = date.getDayOfWeek();
        System.out.println("Year: " + year + "\nMonth: " + month + "\nDay of the month: " + day + "\nDay of the week: " + dayOfTheWeek);
    }
}