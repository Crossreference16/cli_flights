import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainMenuTest {
    Flight flight1;

    @BeforeEach

    public void setUp() {
        ArrayList<String> passengers = new ArrayList<String>();
        passengers.add(0, "Bob");
        flight1 = new Flight("Singapore", 43, passengers);
//        ArrayList<Flight> flights = new ArrayList<>();

    }

    @Test
    public void testAddFlight(){
        MainMenu.flights.add(flight1);
        assertThat
    }


}