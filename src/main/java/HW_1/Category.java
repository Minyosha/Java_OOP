package HW_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Category extends Product {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    static ArrayList<Category> allCategories = new ArrayList<>();
    Product product;

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = new ArrayList<>();
        allCategories.add(this);
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "Категория: " + this.name + ", {Товар} = цена: " + this.products;
    }

    public void add(Product product) {
        this.products.add(product);
    }


}
