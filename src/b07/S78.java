package b07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class S78 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(LocalDate.of(2019, Month.JULY, 30));
        System.out.println(LocalDate.of(2019, 07, 30));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime ldt = LocalDateTime.of(date, time);
        System.out.println(ldt);
    }
}
