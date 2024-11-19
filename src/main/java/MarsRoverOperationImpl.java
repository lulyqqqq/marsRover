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
    public String move() {
        switch (direction) {
            case N -> y++; // 北，y+1
            case S -> y--; // 南，y-1
            case E -> x++; // 东，x+1
            case W -> x--; // 西，x-1
        }

        return x + ":" + y + ":" + direction;
    }

    @Override
    public String moreCommands(String command,String status) {
        // 解析状态 (x:y:direction)
        String[] parts = status.split(":");
        x = Integer.parseInt(parts[0]);
        y = Integer.parseInt(parts[1]);
        direction = Direction.valueOf(parts[2]);

        // 执行多个步骤
        for (char c : command.toCharArray()) {
            switch (c) {
                case 'M': // 移动
                    switch (direction) {
                        case N -> y++; // 北，y+1
                        case S -> y--; // 南，y-1
                        case E -> x++; // 东，x+1
                        case W -> x--; // 西，x-1
                    }
                    break;
                case 'L': // 左转
                    turnLeft();
                    break;
                case 'R': // 右转
                    turnRight();
                    break;
            }
        }
        return x + ":" + y + ":" + direction;
    }
}
