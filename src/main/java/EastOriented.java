public class EastOriented implements Orientation{
    @Override
    public Direction getDirection() {
        return Direction.E;
    }

    @Override
    public Orientation turnLeft() {
        return new NorthOriented();
    }

    @Override
    public Orientation turnRight() {
        return new SouthOriented();
    }

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.X() + 1,coordinate.Y());
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.X() - 1,coordinate.Y());
    }
}