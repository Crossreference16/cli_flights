import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

   protected static ArrayList<Flight> flights = new ArrayList<>();
   private static Passenger passengerOne;
   private static Passenger passengerTwo;


   //      //flights.add(new Flight("Singapore", 111, List.of(new Passenger("John,", 12, 13))));
   //      flights.add(new Flight("Singapore", 111, List.of(passengerOne, passengerTwo)));
   //      displayFlights();
   //      System.out.println(passengerOne);







    public static void main(String[] args) {

        System.out.println("Welcome to Flight Checker! Please select one of the following options (type in number)");
        System.out.println("1. Add Flight \n2. Display all available Flights \n3. Add a new passenger\n4. Book a passenger onto a flight\n5. Cancel a flight.\n");
        int userOption = 0;
        Scanner scanner = new Scanner(System.in);

//ask the user to enter options 1-5
//when the user enters 1-5, it will take them to the corresponding method
//if the user does not enter 1-5, it throws in the exception, which tells them they entered something wrong
//it loops them back to the options menu

        boolean running = true;
        while(running) {
        try{
           userOption = scanner.nextInt();
           System.out.println("This works");
           }
        catch (Exception exception){
           System.out.println("Try again!");
           scanner.nextLine();
           continue;
           };

           //if statements
           if (userOption == 1){

             passengerOne = new Passenger("Bob", 125, 357);
             passengerTwo = new Passenger ("Lucy", 467, 259);

             System.out.println("Put in the destination");
             String userDestination = scanner.nextLine();
             Flight flight = new Flight(userDestination, 12, List.of(passengerOne, passengerTwo));
             addFlight(flight);


             running = false;
           }





          }
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
