public interface MarsRoverOperation {
    String showStatus();

    String turnLeft();

    String turnRight();

    String move(String command,String status);
}
