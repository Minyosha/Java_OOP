package HW_6.controller;

import HW_6.view.MainView;

import java.io.IOException;
import java.util.Scanner;

public class MainController implements Controller {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() throws IOException {
        Controller controller = null;
        MainView mainView = new MainView();
        while (true) {
            mainView.showMenu();
            int menuIndex = scanner.nextInt();
            switch (menuIndex) {
                case 0 -> System.exit(0);
                case 1 -> controller = new ComplexController();
                case 2 -> controller = new RationalController();
                default -> {
                    System.out.println("Ошибка ввода");
                    continue;
                }
            }
            controller.run();
        }
    }
}

