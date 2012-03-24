import javax.persistence.*;
import java.io.Serializable;
import java.uti.Date;

/**
 * Seats table.
 * 
 * @author (Nathanael Underwood) 
 * @version (1.0.0 - 18 Mar 2012)
 */

@Entity(name = "CUSTOMER_TABLE")
public class Seats implements Serializable{
	@ID
	@Column(name="SEAT_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long seatID;
	
	@Column(name="SEAT_NUMBER", nullable=false, length=50)
	private String seatNum;
	
	@Column(name="THEATRE_ID", nullable=false)
	private long theatreID;	

	@Column(name="SEAT_TYPE", nullable=false, length=50)
	private String seatType;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;	
	
}