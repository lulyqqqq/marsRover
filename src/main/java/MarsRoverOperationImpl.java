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
        return showStatus();
    }

    @Override
    public String turnRight() {
        switch (direction) {
            case N -> direction = Direction.E;
            case W -> direction = Direction.N;
            case S -> direction = Direction.W;
            case E -> direction = Direction.S;
        }
        return  showStatus();
    }

    @Override
    public String move() {
        switch (direction) {
            case N -> y++;
            case S -> y--;
            case E -> x++;
            case W -> x--;
        }

        return showStatus();
    }

    @Override
    public String moreCommands(String command,String status) {
        String[] parts = status.split(":");
        x = Integer.parseInt(parts[0]);
        y = Integer.parseInt(parts[1]);
        direction = Direction.valueOf(parts[2]);

        for (char c : command.toCharArray()) {
            switch (c) {
                case 'M': // 移动
                    switch (direction) {
                        case N -> y++;
                        case S -> y--;
                        case E -> x++;
                        case W -> x--;
                    }
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
            }
        }
        return showStatus();
    }
}
