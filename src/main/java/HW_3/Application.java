package HW_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    static List<String> answersList = new ArrayList<>();

    void startGame() {
        System.out.println(answersList);
        System.out.println("Выберите тип игры");
        System.out.println("1 - цифры");
        System.out.println("2 - анлгийские символы");
        System.out.println("3 - русские символы");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new EnGame();
                break;
            case 3:
                game = new RuGame();
                break;
            default:
                System.out.println("Данная игра еще не добавлена");
        }

        System.out.println("Введите количество символов: ");
        Integer sizeWord = scanner.nextInt();
        System.out.println("Введите максимальное количество попыток: ");
        Integer attempts = scanner.nextInt();
        game.start(sizeWord, attempts);

        while (game.getGameStatus().equals(GameStatus.START)) {
            if (Answer.count == attempts) {
                game.stop();
            }
            System.out.println("Ход: ");
            String answer = scanner.nextLine();
            Answer answerGame = game.inputValue(answer);
            answersList.add(answer);
            System.out.println("быков: " + answerGame.getBull() + ", коров: " + answerGame.getCow());
        }
        System.out.println("Игра окончена за " + (Answer.count - 1) + " ходов");


        System.out.println("Результаты игры:");
        if (game.getGameStatus().equals(GameStatus.WIN)) {
            System.out.println("Победа, загаданная комбинация " + game.getWord());
        } else if (game.getGameStatus().equals(GameStatus.LOSE)) {
            System.out.println("Поражение, загаданная комбинация " + game.getWord());
        }

        System.out.println("Вывести историю ходов? y - да, n - нет");
        String showHistory = scanner.next();
        if (showHistory.equals("y")) {
            System.out.println("Варианты ответов:");
            answersList.remove(0);
            System.out.println(answersList);
        }
        answersList.clear();
    }


}
