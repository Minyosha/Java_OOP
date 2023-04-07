package HW_2;

public class Threadmill implements Obstacles {
    Integer distanceToRun;

    public Threadmill(Integer distanceToRun) {
        this.distanceToRun = distanceToRun;
    }

    public Threadmill() {
    }

    public Integer getDistanceToRun() {
        return distanceToRun;
    }

    @Override
    public Integer getObstacleProperties() {
        return distanceToRun;
    }

    public void setDistanceToRun(Integer distanceToRun) {
        this.distanceToRun = distanceToRun;
    }
}
