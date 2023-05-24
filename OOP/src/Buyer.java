
import java.util.ArrayList;

public class Buyer extends Person{
	private int quantity;
	private String currentPlace;
	private String destination;
	private String type;
	
	public Buyer(int quantity, String currentPlace, String destination, String type, ArrayList<Person> person) {
		super(person.get(0).getName(), "", "", 1, "", "");
		this.quantity = quantity;
		this.currentPlace = currentPlace;
		this.destination = destination;
		this.type = type;
	}
	
	public boolean CheckFlight(String currentPlace, String destination) {
		String route = currentPlace + " to " + destination;
		Flight flight = new Flight(route);
		return flight.hasFlight(route);
	}
	public ArrayList<Flight> getFlights(String currentPlace, String destination) {
		String route = currentPlace + " to " + destination;
		Flight flight = new Flight(route);
		return flight.showAvailableFlights(route);
	}
	public Flight selectFlight(ArrayList<Flight> flights, int index) {
		return flights.get(index);
	}
	
	public Ticket buyTicket(Flight flight, String seatNo) {
		Ticket ticket = new Ticket();
		if(ticket.hasSeat(flight, seatNo)) {
			return ticket.bookSeat(flight, seatNo);
		}else {
			return new Ticket(new Aeroplane(new Airline("Biman"), "Boing777", 300, "Economie"), "A1", "Dhaka", "India", 200);
		}
	}
	
	public void refundTicket(Ticket ticket, Payment payment) {
		Refund refund = new Refund(ticket, payment.getBuyer(), payment.getPaymentId(), ticket.getPrice());
		refund.makeRefund();
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCurrentPlace() {
		return currentPlace;
	}
	public void setCurrentPlace(String currentPlace) {
		this.currentPlace = currentPlace;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
