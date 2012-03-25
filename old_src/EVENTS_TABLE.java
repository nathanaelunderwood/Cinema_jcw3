import javax.persistence.*;
import java.io.Serializable;
import java.uti.Date;

/**
 * Events table.
 * 
 * @author (Nathanael Underwood) 
 * @version (1.0.0 - 18 Mar 2012)
 */

@Entity(name = "EVENTS_TABLE")
public class Events implements Serializable{
	@ID
	@Column(name="EVENT_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long eventID;
	
	@Column(name="EVENT_DESCR", nullable=false, length=200)
	private String eventDescr;
	
	@Column(name="SHORT_DESCR", nullable=false, length=70)
	private String shortDescr;	

	@Column(name="EVENT_DATE", nullable=false)
	private Date eventDate;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;	
	
}