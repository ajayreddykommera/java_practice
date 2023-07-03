package Opps_concept;

public class Product {
    double price = 15.00;

    public double getPrice() {
        return price;
    }

    public double getPrice(int quantity) {
        double price_updated = quantity * price;
        return price_updated;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
