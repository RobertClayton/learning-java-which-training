package examples;

import polymorphism.NormalGood;
import polymorphism.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList<Product> products = new ArrayList<>();
//        products.add(new NormalGood("Dog food", 0.15));
//        products.add(new NormalGood("Fork", 0.19));
//        Product product = products.get(0);
//        System.out.println(product.getName());

//        HashSet<Product> products = new HashSet<>();
//        products.add(new NormalGood("Dog food", 0.15));
//        products.add(new NormalGood("Fork", 0.19));
////        HashSet does not have a .get() method:
//        for (Product product: products) {
//            System.out.println(product.getName());
//        }

        ArrayList<Product> products2 = new ArrayList<>();
        NormalGood dog_food1 = new NormalGood("Dog food", 0.19);
        NormalGood dog_food2 = new NormalGood("Dog food", 0.19);
        products2.add(dog_food1);
        products2.remove(dog_food2);
        System.out.println(products2.size());

        HashMap<Integer, Product> products3 = new HashMap<>();
        NormalGood dog_food3 = new NormalGood("Dog food", 0.19);
        products3.put(1, dog_food3);
        System.out.println(products3.get(1).getName());

        Collection<Product> values = products3.values();
        for (Product product: values) {
            System.out.println(product.getName());
        }
        Collection<Integer> keys = products3.keySet();
        for (Integer key: keys) {
            System.out.println("Key: " + key);
        }
    }
}
