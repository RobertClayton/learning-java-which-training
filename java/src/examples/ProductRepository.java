package examples;

import polymorphism.Product;

public interface ProductRepository {
    void create(Product product);
    Product selectById(int id);

}

class ArrayProductRepository implements ProductRepository {

    private int index;
    private Product[] products = new Product[10];
    @Override
    public void create(Product product) {
        products[index] = product;
        index++;
    }
    @Override
    public Product selectById(int id) {
        return null;
    }
}