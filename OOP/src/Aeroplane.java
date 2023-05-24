
public class Aeroplane {
	private Airline airline;
	private String model;
	private int seatCapacity;
	private String type;
	
	
	public Aeroplane(Airline airline, String model, int seatCapacity, String type) {
		super();
		this.airline = airline;
		this.model = model;
		this.seatCapacity = seatCapacity;
		this.type = type;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
