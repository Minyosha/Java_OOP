package HW_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Курица", 250.0, 5.0);
        Product p2 = new Product("Хлеб", 42.0, 5.0);
        Product p3 = new Product("Молоко", 60.0, 5.0);
        Product p4 = new Product("Кирпич", 20.0, 5.0);
        Product p5 = new Product("Песок", 100.0, 5.0);
        Product p6 = new Product("Гвозди", 200.0, 5.0);
        Product p7 = new Product("Nvidia rizen rtxxx 407950xtx gtx super 128GB 7.2ggz OC 4.2v", 1000.0, 5.0);

        Category Food = new Category("Еда", new ArrayList<Product>());
        Food.add(p1);
        Food.add(p2);
        Food.add(p3);
        Category Materials = new Category("Материалы", new ArrayList<Product>());
        Materials.add(p4);
        Materials.add(p5);
        Materials.add(p6);
        Category ComputerParts = new Category("Компьютерные части", new ArrayList<Product>());
        ComputerParts.add(p7);


        User MrClub = new User("Mr.Club", "i_like_samsa");
        User user1 = new User("User1", "i12321");
        User user2 = new User("User2", "iasaa321");

        user2.basket.add(p6);
        MrClub.basket.add(p7);
        MrClub.basket.add(p1);
        user1.basket.add(p2);

        System.out.println("Товары по категориям:");
        for (Category category : Category.allCategories) {
            System.out.println(category);
        }

//        for (Product products: Product.allProductsAtStore) {
//            System.out.println(products);
//        }

        System.out.println();
        System.out.println("Все пользователи и их корзины:");
        User.printAllUsers();

//        System.out.println("Все товары в корзинах:");
//        for (Product products: Basket.allProductsAtBasket) {
//            System.out.println(products);
//        }

        System.out.println();
        System.out.println("Произведена покупка товаров");
        for (int i = 0; i < Basket.allProductsAtBasket.size(); i++) {
            for (int j = 0; j < Product.allProductsAtStore.size(); j++) {
                if (Basket.allProductsAtBasket.get(i).equals(Product.allProductsAtStore.get(j)) == true) {
                    Product.allProductsAtStore.remove(j);
                }
            }
        }

        System.out.println();
        System.out.println("Оставшиеся товары в магазине:");
        System.out.println(Product.allProductsAtStore);
        User.printAllUsers();
        user2.basket.clear();
        System.out.println();
        User.printAllUsers();


    }





}