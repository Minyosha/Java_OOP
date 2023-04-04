package HW_1;

import java.util.ArrayList;

public class User extends Basket {
    static ArrayList<User> allUsers = new ArrayList<>();
    private String login;
    private String password;
    Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
        allUsers.add(this);
    }

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
        allUsers.add(this);
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "{" + "Пользователь = " + this.login + ", пароль = " + this.password + ", баланс = $" + " " + this.basket + '}';
    }

    public static void printAllUsers() {
        for (User users : allUsers) {
            System.out.println(users);
        }
    }


}
