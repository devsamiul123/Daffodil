
import java.util.ArrayList;

public class Flight {
	private Schedule schedule;
	private Aeroplane aeroplane;
	private String route;
	
	public Flight(String route) {
		this.route = route;
	}
	public Flight(Schedule schedule, Aeroplane aeroplane, String route) {
		super();
		this.schedule = schedule;
		this.aeroplane = aeroplane;
		this.route = route;
	}
	
	public boolean hasFlight(String route) {
		
		int flag=0;
		ArrayList<Flight> flightList = Flight.FlightList();
		for(Flight f : flightList) {
			if(f.getRoute().equals(route)) {
				flag=1;
				return true;
			}
		}
		if(flag==0) {
			return false;
		}else {
			return true;
		}
	}
	
	public ArrayList<Flight> showAvailableFlights(String route){
		
		ArrayList<Flight> availableFlightsList =  new ArrayList<Flight>();
		ArrayList<Flight> flightList = Flight.FlightList();
		
		for(Flight f : flightList) {
			if(f.getRoute().equals(route)) {
				availableFlightsList.add(f);
			}
		}
		return availableFlightsList;
	}
	
	public static ArrayList<Flight> FlightList(){
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		Flight f1 = new Flight(new Schedule("15/10/2023", "12:30 PM"), new Aeroplane(new Airline("Biman"), "Boing777", 300, "Economie"), "Dhaka to India");
		Flight f2 = new Flight(new Schedule("10/09/2023", "01:30 PM"), new Aeroplane(new Airline("Biman"), "Boing787", 400, "Business"), "Dhaka to Saudi");
		Flight f3 = new Flight(new Schedule("12/11/2023", "07:30 AM"), new Aeroplane(new Airline("US Bangla"), "Cessna411", 16, "Executive"), "Dhaka to India");
		
		flightList.add(f1);
		flightList.add(f2);
		flightList.add(f3);
		
		return flightList;
	}
	
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Aeroplane getAeroplane() {
		return aeroplane;
	}
	public void setAeroplane(Aeroplane aeroplane) {
		this.aeroplane = aeroplane;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
}
