public class MarsRoverOperationImpl implements MarsRoverOperation {
    private Direction direction;
    private int x = 0;
    private int y = 0;
    public MarsRoverOperationImpl(){
        direction = Direction.N;
    }

    @Override
    public String showStatus() {
        return x+":"+y+":"+direction;
    }

    @Override
    public String turnLeft() {
        switch (direction) {
            case N -> direction = Direction.W;
            case W -> direction = Direction.S;
            case S -> direction = Direction.E;
            case E -> direction = Direction.N;
        }
        return x+":"+y+":"+direction;
    }

    @Override
    public String turnRight() {
        switch (direction) {
            case N -> direction = Direction.E;
            case W -> direction = Direction.N;
            case S -> direction = Direction.W;
            case E -> direction = Direction.S;
        }
        return  x+":"+y+":"+direction;
    }

    @Override
    public String move(String command,String status) {
        return x + ":" + y + ":" + direction;
    }
}
