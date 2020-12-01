package marsrover;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest {

    @Test
    public void receives_f_when_pointing_north_then_moves_forward() {
        MarsRover marsrover = new MarsRover();
        marsrover.move("f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(1));
    }

    @Test
    public void receives_f_when_pointing_south_then_moves_forward() {
        MarsRover marsrover = new MarsRover();
        marsrover.origin(0, 0, "S");
        marsrover.move("f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(-1));
    }

    @Test
    public void receives_f_when_pointing_east_then_moves_forward() {
        MarsRover marsrover = new MarsRover();
        marsrover.origin(0, 0, "E");
        marsrover.move("f");

        assertThat(marsrover.x, is(1));
        assertThat(marsrover.y, is(0));
    }

    @Test
    public void receives_f_when_pointing_west_then_moves_forward() {
        MarsRover marsrover = new MarsRover();
        marsrover.origin(0, 0, "W");
        marsrover.move("f");

        assertThat(marsrover.x, is(-1));
        assertThat(marsrover.y, is(0));
    }

    @Test
    public void receives_f_when_pointing_south_then_moves_forward_origin_is_0_1() {
        MarsRover marsrover = new MarsRover();
        marsrover.origin(0, 1, "S");
        marsrover.move("f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(0));
    }

    @Test
    public void receives_f_when_pointing_north_then_moves_forward_origin_is_0_1() {
        MarsRover marsrover = new MarsRover();
        marsrover.origin(0, 1, "N");
        marsrover.move("f");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(2));
    }

    @Test
    public void receives_b_when_pointing_north_then_moves_backwards() {
        MarsRover marsrover = new MarsRover();
        marsrover.move("b");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(-1));
    }

    @Test
    public void receives_x_do_nothing() {
        MarsRover marsrover = new MarsRover();
        marsrover.move("x");

        assertThat(marsrover.x, is(0));
        assertThat(marsrover.y, is(0));
        assertThat(marsrover.direction, is("N"));
    }
}
