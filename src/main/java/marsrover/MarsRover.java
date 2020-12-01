package marsrover;

public class MarsRover {
    public int x = 0;
    public int y = 0;
    public String direction = "N";

    public void move(String command) {
        if (command == "f") {
            {
                if (this.direction == "N") {
                    y++;
                } else if (this.direction == "S") {
                    y--;
                } else if (this.direction == "E") {
                    x++;
                } else if (this.direction == "W") {
                    x--;
                }
            }
        } else if (command == "b") {
            if (this.direction == "N") {
                y--;
            }
        } else if (command == "l") {
            if (this.direction == "S") {
                this.direction = "E";
            } else {
                this.direction = "W";
            }
        }
    }

    public void origin(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
