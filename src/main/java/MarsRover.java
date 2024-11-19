public class MarsRover {
    private Direction direction;
    public MarsRover(){
        direction = Direction.N;
    }
    public String showStatus() {
        return "0:0:"+direction;
    }


    public String executeCommand(String command) {
        if ("L".equals(command)){
            switch (direction) {
                case N -> direction = Direction.W;
                case W -> direction = Direction.S;
                case S -> direction = Direction.E;
                case E -> direction = Direction.N;
            }
        }else if ("R".equals(command)){
            switch (direction) {
                case N -> direction = Direction.E;
                case W -> direction = Direction.N;
                case S -> direction = Direction.W;
                case E -> direction = Direction.S;
            }
        }
        return "0:0:"+direction;
    }
}
