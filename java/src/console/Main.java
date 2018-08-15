package console;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is how you print a string");

        int a = 5;
        double d = Math.pow(2,40); // 2^40
        System.out.println("Double = " + d);

        d = a; // you can assign an int to a double
        int j = (int)d; // but you have to force a double into an int
        System.out.println("Int = " + j);

        // shortcut type: 'fori' then 'tab key'
        for (int i = 0; i < 10; i++) {
            // shortcut type: 'sout' then 'tab key'
            System.out.println(i);
        }

        // Infinite loop, if there was no break statement:
        int counter = 0;
        for (;;) {
            counter++;

            if (counter == 10) {
                break;
            } else {
                continue;
            }
        }

        double intTotal = 0.0;
        for (int i = 0; i < 10; i++) {
            intTotal += Math.pow(2,i);
        }
        System.out.println(intTotal);

        // While loops
        int x = 0;
        while (x < 10) {
            x++;
        }

        // Do while
        do{
            x++;
        } while (x < 20);
    }
}
