public class MarsRover {
    MarsRoverOperationImpl marsRoverOperation = new MarsRoverOperationImpl();
    public String showStatus(){
        return marsRoverOperation.showStatus();
    }
    public String executeCommand(String command) {
        String report = showStatus();
        if ("L".equals(command)){
            report = marsRoverOperation.turnLeft();
        }else if ("R".equals(command)){
            report = marsRoverOperation.turnRight();
        }else if ("M".equals(command)){
            report = showStatus();
            report = marsRoverOperation.move(command,report);
        }
        return report;
    }
}
