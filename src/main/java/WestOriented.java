public class WestOriented implements Orientation{
    @Override
    public Direction getDirection() {
        return Direction.W;
    }

    @Override
    public Orientation turnLeft() {
        return new SouthOriented();
    }

    @Override
    public Orientation turnRight() {
        return new NorthOriented();
    }

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.X() - 1,coordinate.Y());
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.X() + 1,coordinate.Y());
    }
}