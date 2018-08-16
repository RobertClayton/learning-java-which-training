package console;

public class Maths {
    public static int factorial(int i) {
        if (i == 1) {
            return 1;
        }
        // i-- would pass i into the method and then decrement i, which in this case causes a stackoverflow error! :D
        return i * factorial(--i);
    }
}
