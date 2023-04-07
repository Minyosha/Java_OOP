package HW_2;

public class Human implements Competitors {
    Integer maxRunDistance;
    Integer maxJumpDistance;
    String name;
    boolean isActive;

    public Human(Integer maxRunDistance, Integer maxJumpDistance, String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.name = name;
        this.isActive = true;
    }

    public Human() {
    }

    @Override
    public void run(Integer distance) {
        if (distance > maxRunDistance) {
            System.out.println(this.name + " не пробежал " + distance + " метров");
            this.isActive = false;
        } else {
            System.out.println(this.name + " пробежал " + distance + " метров");
        }

    }

    @Override
    public void jump(Integer height) {
        if (height > maxJumpDistance) {
            System.out.println(this.name + " не перепрыгнул стену высотой " + height + " сантиметров");
        } else {
            System.out.println(this.name + " перепрыгнул стену высотой " + height + " сантиметров");
        }

    }

    public void tryToOvercome(Obstacles obstacles) {
        if (obstacles.getClass() == Wall.class) {
            jump(obstacles.getObstacleProperties());
        } else {
            run(obstacles.getObstacleProperties());
        }
    }

    @Override
    public boolean isCompeting() {
        if (isActive) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
