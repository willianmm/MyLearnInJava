package SecondAba;
import java.time.Duration;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTime {
    public static void main(String[] args) {
        LocalDate once = LocalDate.parse("2022-07-20");
        LocalDateTime twice = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant third = Instant.parse("2022-07-20T01:30:26Z");
        LocalDate weekMin = once.minusWeeks(3);
        LocalDate nextWeek = once.plusWeeks(100);
        System.out.println(nextWeek);
        System.out.println(weekMin);
        Instant forever = third.minus(1000, ChronoUnit.DAYS);
        System.out.println(forever);
        Duration w1 = Duration.between(forever, third);
        System.out.println(w1.toHours());
        Duration w2 = Duration.between(weekMin.atStartOfDay(), nextWeek.atStartOfDay());
        System.out.println(w2);






        /*LocalDate date1 = LocalDate.ofInstant(third, ZoneId.systemDefault());
        LocalDate date2 = LocalDate.ofInstant(third, ZoneId.of("Portugal"));

        LocalDateTime date3 = LocalDateTime.ofInstant(third,ZoneId.of("Asia/Tokyo"));
        LocalDateTime date4 = LocalDateTime.ofInstant(third,ZoneId.systemDefault());
        System.out.println(date3);
        System.out.println(date4);

        System.out.println("date 4 " + date4.getDayOfWeek());
        System.out.println("date 4 " + date4.getDayOfMonth());
        System.out.println("date 4 " + date4.getDayOfYear());
        System.out.println("date 4 " + date4.getYear());
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.getDayOfYear());*/


    }
}
