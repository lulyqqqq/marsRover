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

    public MarsRover() {
        this.direction = Direction.N;
        this.coordinate = new Coordinate();
        this.orientation = new NorthOriented();
    }

    public String showStatus() {
        return this.coordinate.X() + ":" + this.coordinate.Y() + ":" + this.direction;
    }

    public String executeCommand(String commands) {
        Map<Character, Runnable> commandActions = getCommandMap();

        commands.chars()
                .mapToObj(c -> (char) c)
                .forEach(command -> {
                    Runnable action = commandActions.get(command);
                    if (action != null) {
                        action.run();
                    } else {
                        throw new IllegalArgumentException("Invalid command: " + command);
                    }
                });

        return showStatus();
    }

    public HashMap<Character, Runnable> getCommandMap() {
        HashMap<Character, Runnable> commandActions = new HashMap<>();
        commandActions.put(L, () -> {
            orientation = orientation.turnLeft();
            direction = orientation.getDirection();
        });
        commandActions.put(R, () -> {
            orientation = orientation.turnRight();
            direction = orientation.getDirection();
        });
        commandActions.put(M, () -> coordinate = orientation.moveForward(coordinate));
        commandActions.put(B, () -> coordinate = orientation.moveBackward(coordinate));
        return commandActions;
    }


}
