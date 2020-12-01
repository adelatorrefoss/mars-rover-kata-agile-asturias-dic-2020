package marsrover;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest {

    @Test
    public void receives_f_when_pointing_north_then_moves_forward() {
        MarsRover marsrover = new MarsRover();
        marsrover.move("N", "f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(1));
    }

    @Test
    public void receives_f_when_pointing_south_then_moves_forward() {
        MarsRover marsrover = new MarsRover();
        marsrover.move("S", "f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(-1));
    }

}
