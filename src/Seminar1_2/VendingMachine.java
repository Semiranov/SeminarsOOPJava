package Seminar1_2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(){
        products = new ArrayList<>();
//        products.add(new Product());

    }

    public List<Product> getProductByCost(double cost) {
        List<Product> res = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCost() <= cost) {
                res.add(products.get(i));
            }
        }
        return res;
    }


}
