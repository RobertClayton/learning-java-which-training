package console;

import java.time.*;

public class DatesAndTimes {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant, instant1);

        System.out.println(duration.toMillis());

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2020, Month.APRIL,18);
        System.out.println(localDate1);

//        Period p = Period.between(localDate, localDate1);
//        System.out.println(p.getYears() + "year " + p.getMonths() + "months");

        ZonedDateTime z = ZonedDateTime.of(localDate, ZoneId.of("Asia/Seoul"));
        System.out.println(z);
    }
}
