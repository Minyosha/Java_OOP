package HW_2;

public class Wall implements Obstacles {
    Integer heightToJump;

    public Wall(Integer heightToJump) {
        this.heightToJump = heightToJump;
    }

    public Wall() {
    }

    public Integer getHeightToJump() {
        return heightToJump;
    }

    @Override
    public Integer getObstacleProperties() {
        return heightToJump;
    }

    public void setHeightToJump(Integer heightToJump) {
        this.heightToJump = heightToJump;
    }
}
