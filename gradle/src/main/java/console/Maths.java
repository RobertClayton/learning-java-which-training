package console;

public class Maths {
    public static int factorial(int i) {
        return i==1 ? 1 : i * factorial(i-1);
    }
}
