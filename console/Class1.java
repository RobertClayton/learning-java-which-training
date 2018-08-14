package console;

public class Class1 {

    public static void main(String[] args) {
        System.out.println("printing this string");

        outer:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    continue; outer;
                }
            }
            System.out.println(i);
        }
    }
}` `
