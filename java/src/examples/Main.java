package examples;

import polymorphism.VeblenGood;

public class Main {
    public static void main(String[] args) {
        ProductRepository repository = new ArrayProductRepository();
        repository.create(new VeblenGood("Rolls", 40000));
    }
}
