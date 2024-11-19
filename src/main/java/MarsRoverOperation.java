public interface MarsRoverOperation {
    String showStatus();

    String turnLeft();

    String turnRight();

    String move();

    String moreCommand(String command,String status);
}
