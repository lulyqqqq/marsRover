public class SouthOriented implements Orientation{
    @Override
    public Direction getDirection() {
        return Direction.S;
    }

    @Override
    public Orientation turnLeft() {
        return new EastOriented();
    }

    @Override
    public Orientation turnRight() {
        return new WestOriented();
    }

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.X(),coordinate.Y() - 1);
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.X(),coordinate.Y() + 1);
    }

}