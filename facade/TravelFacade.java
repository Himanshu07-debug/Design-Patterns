import java.util.*;
import java.util.ArrayList;
    public class TravelFacade {
    private HotelBooker hotelBooker;   
    private FlightBooker flightBooker;   

    public void getFlightsAndHotels(Date from, Date to)  { 
        ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);
        ArrayList<Hotel> hotels = hotelBooker.getHotelsFor(from, to);
        
//process and return   
}
}
