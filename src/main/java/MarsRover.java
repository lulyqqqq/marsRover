public class MarsRover {
    MarsRoverOperationImpl marsRoverOperation = new MarsRoverOperationImpl();
    public String showStatus(){
        return marsRoverOperation.showStatus();
    }
    public String executeCommand(String command) {
        String report = "";
        if ("L".equals(command)){
            report = marsRoverOperation.turnLeft();
        }else if ("R".equals(command)){
            report = marsRoverOperation.turnRight();
        }
        return report;
    }
}
