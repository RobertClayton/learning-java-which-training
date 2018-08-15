package console;

import java.time.ZoneId;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // build an instance of a named class that implements the Runnable interface
        RunnableImpl runnableImpl = new RunnableImpl();

        // build an instance of an anonymous class
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {

            }
        };

        // lambda expression
        Runnable lambda = () -> {};

        Predicate<String> predicate = (String s) -> { return s.contains("the"); };
        // different syntax to do the same thing:
        Predicate<String> predicate2 = s -> s.contains("Europe");

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        Stream<String> stream = zoneIds.stream(); // get abstract sequence

        Stream<String> filteredStream = stream.filter(predicate2);

        Collection<String> collection = filteredStream.collect(Collectors.toList());

        // the above can be condensed into one declaration:
        Collection<String> collection2 = ZoneId
                .getAvailableZoneIds()
                .stream()
                .filter(s -> s.contains("Europe"))
                .collect(Collectors.toList());

        long numberOfEuropeanCities = ZoneId
                .getAvailableZoneIds()
                .stream()
                .filter(s -> s.contains("Europe"))
                .count();

        String city = ZoneId
                .getAvailableZoneIds()
                .stream()
                .filter(s -> s.contains("Sofia"))
                .findFirst()
                .orElse(null);
        System.out.println(city);

        for (String zoneId: collection) {
            System.out.println(zoneId);
        }
    }
}