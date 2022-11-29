import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MainMenuTest {
    Flight flight1;
    private Passenger passengerOne;
    private Passenger passengerTwo;

    @BeforeEach

    public void setUp() {
//        List<Passenger> passengers = new List<Passenger>();
        List<Passenger> passengers = new ArrayList<>();
        passengerOne = new Passenger("Bob", 125, 357);
        passengerTwo = new Passenger ("Lucy", 467, 259);
        passengers.add(List.of(passengerOne,passengerTwo));
        //List.of(passengerOne, passengerTwo);
        //passengers.of(0, passengerOne, 1);
        flight1 = new Flight("Singapore", 43, passengers);

//      ArrayList<Flight> flights = new ArrayList<>();

    }


    @Test
    public void testAddFlight(){
        MainMenu.flights.add(flight1);
        assertThat(MainMenu.flights.contains(flight1)).isEqualTo(MainMenu.flights.add(flight1));
    }

    @Test
    public void testDisplayFlight(){
        //add flight1 to flights arraylist
        //test if output equals to
        MainMenu.flights.add(flight1);

    }

}