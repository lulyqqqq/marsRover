import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover(){
        //Given
        MarsRover marsRover = new MarsRover();
        //When
        String report = marsRover.showStatus();
        //Then
        assertEquals("0:0:N",report);
    }
}
