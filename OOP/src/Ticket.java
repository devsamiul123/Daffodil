
import java.util.ArrayList;

public class Ticket {
	private Aeroplane aeroplane;
	private String seatNo;
	private String arrival;
	private String departure;
	private int price;
	
	public Ticket() {
	}
	public Ticket(Aeroplane aeroplane) {
		this.aeroplane = aeroplane;
	}
	public Ticket(Aeroplane aeroplane, String seatNo, String arrival, String departure, int price) {
		super();
		this.aeroplane = aeroplane;
		this.seatNo = seatNo;
		this.arrival = arrival;
		this.departure = departure;
		this.price = price;
	}
	public boolean hasSeat(Flight flight, String seatNo) {
		int flag=0;
		
		ArrayList<Ticket> ticketsList = Ticket.ticketsList();
		
		for(Ticket t : ticketsList) {
			if(t.getSeatNo().equals(seatNo)) {
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
	public Ticket bookSeat(Flight flight, String seatNo) {
		Ticket mySeat = new Ticket();
		ArrayList<Ticket> ticketsList = Ticket.ticketsList();
		
		for(Ticket t : ticketsList) {
			if(t.getSeatNo().equals(seatNo)) {
				mySeat = t;
			}
		}
		return mySeat;
	}
	public static ArrayList<Ticket> ticketsList(){
		ArrayList<Ticket> ticketList =  new ArrayList<Ticket>();
		
		Aeroplane aeroplane1 = new Aeroplane(new Airline("Biman"), "Boing777", 300, "Economie");
		Aeroplane aeroplane2 = new Aeroplane(new Airline("US Bangla"), "Cessna411", 16, "Executive");
		String arrival = "10:30 AM";
		String departure = "11:30 AM";
		int price = 100;
		Ticket t1 = new Ticket(aeroplane1, "C1", arrival, departure, price);
		Ticket t2 = new Ticket(aeroplane2, "C2", arrival, departure, price);
		Ticket t3 = new Ticket(aeroplane2, "C3", arrival, departure, price);
		Ticket t4 = new Ticket(aeroplane1, "E4", arrival, departure, price);
		Ticket t5 = new Ticket(aeroplane1, "G6", arrival, departure, price);
		
		ticketList.add(t1);
		ticketList.add(t2);
		ticketList.add(t3);
		ticketList.add(t4);
		ticketList.add(t5);
		
		return ticketList;
	}
	
	public Aeroplane getAeroplane() {
		return aeroplane;
	}
	public void setAeroplane(Aeroplane aeroplane) {
		this.aeroplane = aeroplane;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
