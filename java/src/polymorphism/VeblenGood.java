package polymorphism;

public class VeblenGood extends Product {
    public VeblenGood() {
    }

    public VeblenGood(String name, double costPrice) {
        super(name, costPrice);
    }

    @Override
    public double getRetailPrice() {
        return getCostPrice() * 5;
    }
}
