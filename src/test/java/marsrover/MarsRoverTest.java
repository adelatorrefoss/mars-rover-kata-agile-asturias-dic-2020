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

    @Test
    public void receives_f_when_pointing_south_then_moves_forward_origin_is_0_1() {
        MarsRover marsrover = new MarsRover();
        marsrover.origin(0, 1);
        marsrover.move("S", "f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(0));
    }

    @Test
    public void receives_f_when_pointing_north_then_moves_forward_origin_is_0_1() {
        MarsRover marsrover = new MarsRover();
        marsrover.origin(0, 1);
        marsrover.move("N", "f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(2));
    }
}
