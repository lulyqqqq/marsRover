public interface Orientation {
    public Direction getDirection();

    public Orientation turnLeft();

    public Orientation turnRight();

    public Coordinate moveForward(Coordinate coordinate);

    public Coordinate moveBackward(Coordinate coordinate);
}