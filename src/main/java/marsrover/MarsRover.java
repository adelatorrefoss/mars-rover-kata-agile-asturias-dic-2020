package marsrover;

public class MarsRover {
    public int x = 0;
    public int y = 0;
    public String direction = "N";


    public void move(String command) {
        if (command == "f") {
            {
                if (this.direction == "N") {
                    y += 1;
                } else if (this.direction == "S") {
                    y -= 1;
                } else if (this.direction == "E") {
                    x += 1;
                } else if (this.direction == "W") {
                    x -= 1;
                }
            }
        } else if (command == "b") {
            if (this.direction == "N") {
                y -= 1;
            }
        }
    }

    public void origin(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
