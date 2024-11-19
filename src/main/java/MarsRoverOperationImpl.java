public class MarsRoverOperationImpl implements MarsRoverOperation {
    private Direction direction;
    public MarsRoverOperationImpl(){
        direction = Direction.N;
    }

    @Override
    public String showStatus() {
        return "0:0:"+direction;
    }

    @Override
    public String turnLeft() {
        switch (direction) {
            case N -> direction = Direction.W;
            case W -> direction = Direction.S;
            case S -> direction = Direction.E;
            case E -> direction = Direction.N;
        }
        return "0:0:"+direction;
    }

    @Override
    public String turnRight() {
        switch (direction) {
            case N -> direction = Direction.E;
            case W -> direction = Direction.N;
            case S -> direction = Direction.W;
            case E -> direction = Direction.S;
        }
        return "0:0:"+direction;
    }

    @Override
    public String move(String command,String status) {
        return "";
    }

}
