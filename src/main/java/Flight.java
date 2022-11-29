import java.util.ArrayList;
import java.util.List;

public class Flight {

    String destination;
    int id;
    List<Passenger> passengers;


    public Flight (String destination, int id, List<Passenger> passengers){
        this.destination = destination;
        this.id = id;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", id=" + id +
                ", passengers=" + passengers +
                '}';
    }

    //Getters + Setters
    public String getDestination() {
        return destination;
    }

    public int getId() {
        return id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setId(int id) {
        this.id = id;
    }
}
