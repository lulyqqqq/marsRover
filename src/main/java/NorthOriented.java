public class NorthOriented implements Orientation{
    @Override
    public Direction getDirection() {
        return Direction.N;
    }

    @Override
    public Orientation turnLeft() {
        return new WestOriented();
    }

    @Override
    public Orientation turnRight() {
        return new EastOriented();
    }

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.X(),coordinate.Y() + 1);
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.X(),coordinate.Y() - 1);
    }
}