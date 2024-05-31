package SecondAba;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.spi.TimeZoneNameProvider;

public class DataHora {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d01 = LocalDate.now();

        LocalDateTime d02 = LocalDateTime.now();//Local time

        Instant d03 = Instant.now();// Zulu Time

        LocalDate d04 = LocalDate.of(2002,11,22);

        LocalDate d05 = LocalDate.parse("2022-07-20");

        LocalDateTime d06 = LocalDateTime.parse("2022-07-20T01:30:26");

        Instant d07 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d08 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDateTime d09 = LocalDateTime.parse("20/07/2024 22:30:44",fmt2);

        LocalDateTime d010 = LocalDateTime.of(2004,11,22, 23, 30, 45);





        System.out.println(d01.format(fmt));
        System.out.println(d02.toString());
        System.out.println(fmt4.format(d03));
        System.out.println(d04.toString());
        System.out.println(d05.toString());
        System.out.println(d06.toString());
        System.out.println(d07.toString());
        System.out.println(d08.toString());
        System.out.println(d09.toString());
        System.out.println(d010.toString());

    }
}
