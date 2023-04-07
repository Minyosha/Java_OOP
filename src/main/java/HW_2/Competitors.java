package HW_2;

public interface Competitors {
    void run(Integer distance);

    void jump(Integer height);

    void tryToOvercome(Obstacles obstacles);

    boolean isCompeting();

    String getName();

}
