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

    @Test
    public void should_face_south_when_orient_west_and_turn_left(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        marsRover.executeCommand("L");
        String report = marsRover.executeCommand("L");
        //Then
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        marsRover.executeCommand("L");
        marsRover.executeCommand("L");
        String report = marsRover.executeCommand("L");
        //Then
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        marsRover.executeCommand("L");
        marsRover.executeCommand("L");
        marsRover.executeCommand("L");
        String report = marsRover.executeCommand("L");
        //Then
        assertEquals("0:0:N",report);
    }

    // turn right
    @Test
    public void should_face_east_when_orient_north_and_turn_right(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        String report = marsRover.executeCommand("R");
        //Then
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_south_when_orient_east_and_turn_right(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        marsRover.executeCommand("R");
        String report = marsRover.executeCommand("R");
        //Then
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        marsRover.executeCommand("R");
        marsRover.executeCommand("R");
        String report = marsRover.executeCommand("R");
        //Then
        assertEquals("0:0:W",report);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        marsRover.executeCommand("R");
        marsRover.executeCommand("R");
        marsRover.executeCommand("R");
        String report = marsRover.executeCommand("R");
        //Then
        assertEquals("0:0:N",report);
    }

    @Test
    public void should_face_north_when_orient_west_and_move(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        String report = marsRover.executeCommand("M");
        //Then
        assertEquals("0:1:N",report);
    }


}
