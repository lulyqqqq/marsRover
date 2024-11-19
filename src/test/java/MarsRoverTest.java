import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    public void testMarsRover(){
        assertTrue(true);
    }

    @Test
    public void should_initialize_mars_rover(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        String report = marsRover.showStatus();
        //Then
        assertEquals("0:0:N",report);
    }

    // turn left
    @Test
    public void should_face_west_when_orient_north_and_turn_left(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        String report = marsRover.executeCommand("L");
        //Then
        assertEquals("0:0:W",report);
    }




}
