package console;

import java.time.ZoneId;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // anonymous class
        Runnable an = new Runnable() {
            @Override
            public void run() {

            }
        };

        // lambda
        Runnable lambda = () -> {};

        Predicate<String> predicate = s -> s.contains("Europe");

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//        for (String zonedId :zoneIds) {
//            System.out.println(zonedId);
//        }
        Stream<String> stream = zoneIds.stream();
        Stream<String> filteredStream = stream.filter(predicate);
        Collection<String> collection = filteredStream.collect(Collectors.toList());
        for (String zonedId :collection) {
            System.out.println(zonedId);
        }

        Collection<String> c = ZoneId.getAvailableZoneIds()
                .stream()
                .filter(s -> s.contains("America"))
                .collect(Collectors.toList());
        for (String zonedId :c) {
            System.out.println(zonedId);
        }

        String city = ZoneId.getAvailableZoneIds()
                .stream()
                .filter(s->s.contains("Sofia"))
                .findFirst()
                .orElse(null);

        System.out.println(city);

//        functional interfaces wtf?
//        implemented methods?
    }
}