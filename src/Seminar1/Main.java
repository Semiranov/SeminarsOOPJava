package Seminar1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Чипсы", 50.0);
        System.out.println(product);
        product.setPrice(55.5);
        System.out.println(product);

        VendingMachine v1 = new VendingMachine();
        VendingMachine v2 = new VendingMachine();
        System.out.println(v1);
        System.out.println(v2);

    }
}