package marsrover;

public class MarsRover {
    public int x = 0;
    public int y = 0;

    public void move(String direction, String command) {
        if (direction == "S") {
            y = -1;
        } else {
            y = 1;
        }
    }
}
