package HW_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWord();
        this.gameStatus = GameStatus.START;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public void stop() {
        gameStatus = GameStatus.LOSE;
    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
            if (value.length() == bulls) {
                gameStatus = GameStatus.WIN;
            }
        }
        return new Answer(value, cows, bulls);
    }

    private String generateWord() {
        Random random = new Random();
        String resWord = "";
        List<String> charList = generateCharList();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWord = resWord.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWord;
    }

    public void checkGameStatus(int bulls, int cows) {
        if (--this.attempts < 1) this.gameStatus = GameStatus.LOSE;
        if (bulls == sizeWord && cows == sizeWord) this.gameStatus = GameStatus.WIN;
    }

    public String getWord() {
        return word;
    }

    abstract List<String> generateCharList();


}
