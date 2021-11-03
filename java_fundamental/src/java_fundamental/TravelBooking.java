package java_fundamental;

public interface TravelBooking {
	
	public void bookTicket();
}

class TicketBookingByAgent implements TravelBooking
{
	TravelBooking t;
	public TicketBookingByAgent(TravelBooking t)
	{
		this.t=t;
	}

	@Override
	public void bookTicket() {
		t.bookTicket();
	}
	
}

class TrainTicket implements TravelBooking
{

	@Override
	public void bookTicket() {
		System.out.println("Train ticket booked !!");
	}
	
}

class FlightTicket implements TravelBooking
{

	@Override
	public void bookTicket() {
		System.out.println("Flight ticket booked !!");
	}
	
}