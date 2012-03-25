import javax.persistence.*;
import java.io.Serializable;
import java.uti.Date;

/**
 * Customer table.
 * 
 * @author (Nathanael Underwood) 
 * @version (1.0.0 - 18 Mar 2012)
 */

@Entity(name = "CUSTOMER_TABLE")
public class Customer implements Serializable{
	@ID
	@Column(name="CUST_ID", nullable=false)
	@GeneratedValue(strategy=GeneratiosnType.AUTO)
	private long custID;
	
	@Column(name="CUST_EMAIL", nullable=false, length=100)
	private String custEmail;
	
	@Column(name="FIRST_NAME", nullable=false, length=50)
	private String firstName;
	
	@Column(name="LAST_NAME", nullable=false, length=50)
	private String lastName;	

	@Column(name="STREET_NAME", nullable=false, length=100)
	private String streetName;

	@Column(name="CITY_NAME", nullable=false, length=50)
	private String cityName;
	
	@Column(name="POST_CODE", nullable=false, length=10)
	private String postCode;
	
	@Column(name="LAST_UPDATED")
	private Date lastUpdated;	
	
}
