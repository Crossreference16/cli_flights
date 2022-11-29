import java.util.ArrayList;
import java.util.List;

public class MainMenu {

   protected static ArrayList<Flight> flights = new ArrayList<>();


    public static void main(String[] args) {
     flights.add(new Flight("Singapore", 111, List.of(new Passenger("John", 123, 101))));
displayFlights();

    }




    public static void addFlight(Flight flight) {

      flights.add(flight);

    }

    public static String displayFlights(){
        String outPut = "";
     for(Flight flight : flights){
         outPut = outPut + flight.toString() + "\n";
      System.out.println(flight.toString());
     }
     return outPut;
    }

    public static void addPassenger(){

     // Flight array list contains flights
     //each flight contains an arrayList of passengers
     //arrayList of passengers contains individual passengers
     //we want to add individual passengers to passengers arrayList.


     //public Flight (String destination, int id, ArrayList<String> passengers){
     //        this.destination = destination;
     //        this.id = id;
     //        this.passengers = passengers;

    }

    public static void bookFlight(){

    }

    public static void cancelFlight(){

    }



}
