package HW_3;

public interface Game {
    void start(Integer sizeWord, Integer attempts);
    void stop();
    Answer inputValue(String value);
    GameStatus getGameStatus();
    String getWord();
}
