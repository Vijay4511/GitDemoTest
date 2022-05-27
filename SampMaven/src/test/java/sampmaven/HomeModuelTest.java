package sampmaven;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeModuelTest {
	
	private static Logger log = LogManager.getLogger(HomeModuelTest.class.getName());
	
	@Test
	public void TicketBooking()
	{
		System.out.println("TicketBookingTC");
		log.info("Executed Ticketbooking test case successfully");
	
	}
	
	
	@Test(groups= {"smoke"})//smoke
	public void Searchbuses()
	{
		
		System.out.println("SearchbusesTC");
		log.debug("Clicked on searchbuses");


	}
	
	@Test
	public void Ticketstatus()
	{
		System.out.println("Ticketstatus");
		log.error("Ticketstatus test has some exception");

	}
	

}
