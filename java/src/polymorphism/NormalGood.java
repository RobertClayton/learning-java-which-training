package polymorphism;

public class NormalGood extends Product {
    public NormalGood() {
    }

    public NormalGood(String name, double costPrice) {
        super(name, costPrice);
    }

    @Override
    public double getRetailPrice() {
        return getCostPrice() * 2;
    }
}
