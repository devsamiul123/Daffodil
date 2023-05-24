
import java.util.ArrayList;

public class Payment {
	private ArrayList<Ticket> tickets;
	private Buyer buyer;
	private String paymentType;
	private String paymentId;
	private int amount;
	
	
	public Payment(ArrayList<Ticket> tickets, Buyer buyer, String paymentType, String paymentId) {
		super();
		this.tickets = tickets;
		this.paymentType = paymentType;
		this.paymentId = paymentId;
		this.buyer = buyer;
		this.amount = tickets.size() * tickets.get(0).getPrice();
	}
	
	public void makePayment(Payment payment) {
		System.out.println("Buyer name is:- " + payment.getBuyer().getName());
		System.out.println("Total ticket:- " + payment.getTickets().size());
		System.out.println("Total amount:- " + payment.getAmount() + "$");
		System.out.println("Payment Type:- " + payment.getPaymentType());
		System.out.println("Payment Id:- " + payment.getPaymentId());
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
