package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
    private final static List<Product> initProduct = new ArrayList<>();

    static {
        initProduct.add(new Product("Snikers", 43.5));
    }

    public VendingMachine() {
        this(initProduct);
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public VendingMachine(String name, Double price) {
        this.products = new ArrayList<>();
        products.add(new Product(name, price));
    }

    public Product getProductByName(String name) {
        for (Product prod : products) {
            if (prod.getName().contains(name)) {
                return prod;
            }

        }
        return null;
    }

    public Product getProductByPrice(Double price) {
        for (Product prod : products) {
            if (prod.getPrice().equals(price)) {
                return prod;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
}
