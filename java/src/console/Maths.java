package console;

public class Maths {
    public static int factorial(int i) {
        int factoralTotal = 1;
        for (int j = i; i > 1 ; i--) {
            factoralTotal *= j--;
            System.out.println(factoralTotal);
        }
        return factoralTotal;
    }
}
