
public class Refund {
	private Ticket ticket;
	private Buyer buyer;
	private String paymentId;
	private int amount;
	
	
	public Refund(Ticket ticket, Buyer buyer, String paymentId, int amount) {
		super();
		this.ticket = ticket;
		this.buyer = buyer;
		this.paymentId = paymentId;
		this.amount = amount;
	}
	
	public void makeRefund() {
		System.out.println("Ticket refunded to:- " + getBuyer().getName());
		System.out.println("Amount refunded:- " + getAmount() + "$");
	}
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
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
