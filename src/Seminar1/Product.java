package Seminar1;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this(name);
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            return;
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }


}
