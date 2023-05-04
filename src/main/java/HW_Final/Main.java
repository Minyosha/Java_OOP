package HW_Final;

import HW_Final.controller.MainController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Для выполнения операций с комплексными числами введите оба числа и выберите операцию");
        MainController mainController = new MainController();
        mainController.run();
    }
}
