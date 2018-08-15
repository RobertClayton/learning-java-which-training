package twitter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Tweet tweet1 = new Tweet();
        Tweet tweet2 = new Tweet("Mike", "My tweets is thus");
        Tweet tweet3 = new Tweet("Mike", "My tweet is here", Category.SATURDAY);
        System.out.println(tweet1.getUsername() + ": " + tweet1.getCategory() + ": " + tweet1.getText());
        System.out.println(tweet2.getUsername() + ": " + tweet2.getCategory() + ": " + tweet2.getText());
        System.out.println(tweet3.getUsername() + ": " + tweet3.getCategory() + ": " + tweet3.getText());
        System.out.println(" ");

        String[] quotes = {
                "Uneasy lies the head that wears a crown.",
                "The fool doth think he is wise, but the wise man knows himself to be a fool.",
                "They make a desert and call it peace.",
                "What hath God wrought",
                "But at my back I always hear time's winged chariot hurrying near"
        };

        Tweet[] tweets = new Tweet[5];

        for (int i = 0; i < 5; i++) {
            tweets[i] = new Tweet(
                    "Rob",
                    quotes[i],
                    Category.MONDAY
            );
        }

        for (Tweet tweet : tweets) {
            System.out.println(
                    tweet.getUsername() + ": "
                            + tweet.getCategory() + ": "
                            + tweet.getText());
        }

        DayOfWeek day = DayOfWeek.WEDNESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Default Day");
                break;
        }

        String s = String.format("%tA", LocalDate.now());
        System.out.println("today is " + s);
        System.out.println(" ");


        String[] quotes2 = {
                "Uneasy lies the head that wears a crown.",
                "The fool doth think he is wise, but the wise man knows himself to be a fool.",
                "They make a desert and call it peace.",
                "What hath God wrought",
                "But at my back I always hear time's winged chariot hurrying near"
        };

        Message[] messages = new Message[5];

        messages[0] = new Tweet("Matt", quotes2[0]);
        messages[1] = new SMS("Matt", quotes2[1]);
        messages[2] = new Tweet("Matt", quotes2[2]);
        messages[3] = new SMS("Matt", quotes2[3]);
        messages[4] = new SMS("Matt", quotes2[4]);

        for (Message message: messages) {
            System.out.println(
                    message.getUsername() + ": "
                            + message.getCategory() + ": "
                            + message.getText());
        }

    }

}
