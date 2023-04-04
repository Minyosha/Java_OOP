package HW_1;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> userBasket = new ArrayList<>();
    static ArrayList<Product> allProductsAtBasket = new ArrayList<>();

    public Basket(ArrayList<Product> userBasket) {
        this.userBasket = userBasket;
    }

    public ArrayList<Product> getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(ArrayList<Product> userBasket) {
        this.userBasket = userBasket;
    }

    public Basket() {
    }

    @Override
    public String toString() {
        return "Корзина: {" + userBasket +
                '}';
//
    }

    public void add(Product product) {
        this.userBasket.add(product);
        allProductsAtBasket.add(product);
    }

}
