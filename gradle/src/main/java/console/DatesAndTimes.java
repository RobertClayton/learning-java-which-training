package console;

import java.time.*;

public class DatesAndTimes {
    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant1, instant2);
        System.out.println(duration.toMillis());


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2018, Month.SEPTEMBER,26);

        Period period = Period.between(localDate, localDate1);
        System.out.println(period.getDays());


        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.from(localDate), ZoneId.of("Europe/Berlin"));
        System.out.printf("%1$td %1$tB %1$tY", zonedDateTime);
    }
}
