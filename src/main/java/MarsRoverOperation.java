public interface MarsRoverOperation {
    String showStatus();

    String turnLeft();

    String turnRight();

    String move();

    String moreCommands(String command,String status);
}
