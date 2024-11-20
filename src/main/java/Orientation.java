public interface Orientation {
    Direction getDirection();

    Orientation turnLeft();

    Orientation turnRight();

    Coordinate moveForward(Coordinate coordinate);

    Coordinate moveBackward(Coordinate coordinate);
}