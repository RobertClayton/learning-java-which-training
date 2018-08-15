package console;

public class Class1 {

    public static void main(String[] args) {

        int prime_num = 0;
        int[] primes = new int[25];

        outer:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    continue outer;
                }
            }
            primes[prime_num++] = i;
        }

        for(int prime : primes) {
            System.out.println(prime);
        }
    }

}
