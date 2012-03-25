import javax.persistence.*;
import java.io.Serializable;
import java.uti.Date;

/**
 * Theatre table.
 * 
 * @author (Nathanael Underwood) 
 * @version (1.0.0 - 18 Mar 2012)
 */

@Entity(name = "THEATRE_TABLE")
public class Theatre implements Serializable{
	@ID
	@Column(name="THEATRE_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long theatreID;
	
	@Column(name="THEATRE_NAME", nullable=false, length=50)
	private String theatreName;

	@Column(name="LAST_UPDATED")
	private Date lastUpdated;
	
}