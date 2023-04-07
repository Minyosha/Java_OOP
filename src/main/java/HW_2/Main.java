package HW_2;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(400, 120, "Вася");
        Human human2 = new Human(250, 50, "Петя");
        Cat cat1 = new Cat(1000, 150, "Кошкан");
        Cat cat2 = new Cat(90, 250, "Блохастик");
        Robot robot1 = new Robot(100, 50, "Болт");
        Robot robot2 = new Robot(700, 100, "Скрипач");


        Threadmill threadmill1 = new Threadmill(100);
        Threadmill threadmill2 = new Threadmill(600);
        Wall wall1 = new Wall(30);
        Wall wall2 = new Wall(90);

        Competitors[] competitors = {human1, human2, cat1, cat2, robot1, robot2};

        Obstacles[] obstacles = {threadmill1, threadmill2, wall1, wall2};

        ArrayList<String> winners = new ArrayList<>();


        for (Competitors struggler : competitors) {
            for (Obstacles obstacle : obstacles) {
                struggler.tryToOvercome(obstacle);
                if (struggler.isCompeting() == false) {
                    System.out.println("*** " + struggler.getName() + " выбыл из гонки ***");
                    break;
                }

            }
            if (struggler.isCompeting() == true) {
                System.out.println("*** " + struggler.getName() + " прошел все испытания ***");
                winners.add(struggler.getName());
            }

        }

        System.out.println("Гонку прошли следующие претенденты: " + winners);


    }
}
