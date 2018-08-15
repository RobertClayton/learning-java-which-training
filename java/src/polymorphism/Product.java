package polymorphism;

public class Product {
    private String name;
    private double costPrice;

    public Product() {
    }

    public Product(String name, double costPrice) {
        setName(name);
        setCostPrice(costPrice);
    }

    public double getRetailPrice() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Product &&
                ((Product)obj).name.equals(name) &&
                ((Product)obj).costPrice == costPrice;

    }
}
