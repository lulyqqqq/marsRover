import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MarsRover {
    private final char L = 'L';
    private final char R = 'R';
    private final char M = 'M';
    private final char B = 'B';
    public Direction direction;
    public Coordinate coordinate;
    public Orientation orientation;

    public MarsRover(){
        this.direction = Direction.N;
        this.coordinate = new Coordinate();
        this.orientation = new NorthOriented();
    }

    public String showStatus() {
        return this.coordinate.X() + ":" + this.coordinate.Y() + ":" + this.direction;
    }

    public String executeCommand(String commands) {
        commands.chars()
                .mapToObj(c -> (char)c)
                .forEach(commandChar -> {
                    switch (commandChar) {
                        case L:
                            orientation = orientation.turnLeft();
                            direction = orientation.getDirection();
                            break;
                        case R:
                            orientation = orientation.turnRight();
                            direction = orientation.getDirection();
                            break;
                        case M:
                            coordinate = orientation.moveForward(coordinate);
                            break;
                        case B:
                            coordinate = orientation.moveBackward(coordinate);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid command: " + commandChar);
                    }
                });
        return showStatus();
    }


}
