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
            report = marsRoverOperation.move();
        }
        return report;
    }

    public String executeMoreCommand(String command,String status) {
        if (status.isEmpty() || status.equals(" ")){
            status = showStatus();
        }
        return marsRoverOperation.moreCommands(command, status);
    }

}
