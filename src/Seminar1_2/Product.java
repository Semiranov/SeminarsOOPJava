package Seminar1_2;

public class Product {
    String name;
    double cost;
    TypeProduct typeProduct;

    public Product(String name, double cost, TypeProduct typeProduct) {
        this.name = name;
        this.cost = cost;
        this.typeProduct = typeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
