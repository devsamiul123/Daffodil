
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	static ArrayList<Person> personList = new ArrayList<Person>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter Your Name:-");
	    String name = scanner.nextLine();
	    
	    System.out.println("Enter Your Phone Number:-");
	    String phnNO = scanner.nextLine();
	    
	    System.out.println("Gender:-");
	    String gender = scanner.nextLine();
	    
	    System.out.println("Your age:-");
	    int age = scanner.nextInt();
	    scanner.nextLine();
	    
	    System.out.println("Address:-");
	    String address = scanner.nextLine();
	    
	    System.out.println("Passport No:-");
	    String passNo = scanner.nextLine();
	     
		
		//ArrayList<Person> personList = new ArrayList<Person>();
		Person p1 = new Person(name, phnNO, gender, age, address, passNo);
		Person p2 = new Person("Samiul", "01900000000", "Male", 22, "Mirpur-14", "XVY4845546YY");
		Person p3 = new Person("Mithila", "01811111111", "Female", 22, "Mirpur-14", "UUX1545546YY");
		Person p4 = new Person("Nikita", "01755555555", "Female", 22, "Mirpur-2", "XZZ863546YY");
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
		int option = 1;
		
		while(option == 1){
			myMethod(scanner);
			
			System.out.println("GO to main menu:-");
			System.out.println("	1. Yes");
			System.out.println("	2. No");
			option = scanner.nextInt();
			scanner.nextLine();
			if(option==2) {
				break;
			}
		}

	}
	
	private static void myMethod(Scanner scanner) {
		System.out.println("Select Option:-");
		System.out.println("	1. Buy Ticket");
		System.out.println("	2. Refund");
		int option = scanner.nextInt();
		scanner.nextLine();
		
		if(option == 1) {
			System.out.println("Current Place:-");
		    String curPlace = scanner.nextLine();
		    
		    System.out.println("Destination:-");
		    String destination = scanner.nextLine();
		    
			Buyer buyer = new Buyer(2, curPlace, destination, "Economie", personList);
			if(buyer.CheckFlight(buyer.getCurrentPlace(), buyer.getDestination())) {
				ArrayList<Flight> flightList = buyer.getFlights(buyer.getCurrentPlace(), buyer.getDestination());
				Flight myFlight = buyer.selectFlight(flightList, 0);
				
				Ticket t1 = buyer.buyTicket(myFlight, "C1");
				Ticket t2 = buyer.buyTicket(myFlight, "E4");
				Ticket t3 = buyer.buyTicket(myFlight, "G6");
				Ticket t4 = buyer.buyTicket(myFlight, "G2");
				ArrayList<Ticket> myTicketsList = new ArrayList<Ticket>();
				
				myTicketsList.add(t1);
				myTicketsList.add(t2);
				myTicketsList.add(t3);
				myTicketsList.add(t4);
				
				Payment payment = new Payment(myTicketsList, buyer, "Cash", "12");
				payment.makePayment(payment);
				
			}else {
				System.out.println("Sorry no flight found");
			}
		}else if(option == 2) {
			
			System.out.println("Current Place:-");
		    String curPlace = scanner.nextLine();
		    
		    System.out.println("Destination:-");
		    String destination = scanner.nextLine();
		    
			Buyer buyer = new Buyer(2, curPlace, destination, "Economie", personList);
			if(buyer.CheckFlight(buyer.getCurrentPlace(), buyer.getDestination())) {
				ArrayList<Flight> flightList = buyer.getFlights(buyer.getCurrentPlace(), buyer.getDestination());
				Flight myFlight = buyer.selectFlight(flightList, 0);
				
				Ticket t1 = buyer.buyTicket(myFlight, "C1");
				Ticket t2 = buyer.buyTicket(myFlight, "E4");
				Ticket t3 = buyer.buyTicket(myFlight, "G6");
				Ticket t4 = buyer.buyTicket(myFlight, "G2");
				ArrayList<Ticket> myTicketsList = new ArrayList<Ticket>();
				
				myTicketsList.add(t1);
				myTicketsList.add(t2);
				myTicketsList.add(t3);
				myTicketsList.add(t4);
				
				Payment payment = new Payment(myTicketsList, buyer, "Cash", "12");
				
				buyer.refundTicket(t1, payment);
				
			}	else {
				System.out.println("Sorry no ticket found");
			}		
		}
	}

}
