import javax.persistence.*;
import java.io.Serializable;
import java.uti.Date;

/**
 * Bookings table.
 * 
 * @author (Nathanael Underwood) 
 * @version (1.0.0 - 18 Mar 2012)
 */

@Entity(name = "BOOKINGS_TABLE")
public class Bookings implements Serializable{
	@ID
	@Column(name="BOOK_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookID;
	
	@Column(name="SEAT_ID", nullable=false)
	private long seatID;
	
	@Column(name="EVENT_ID", nullable=false)
	private long eventID;	

	@Column(name="CUST_ID", nullable=false)
	private long custID;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;	
	
}