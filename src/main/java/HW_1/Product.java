package HW_1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private Double price;
    private Double rating;
    static ArrayList<Product> allProductsAtStore = new ArrayList<>();

    public Product(String name, Double price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        allProductsAtStore.add(this);
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }



    @Override
    public String toString() {
        return "{" + name + ": цена = $" + price + ", рейтинг = " + rating + '}';
    }

}
