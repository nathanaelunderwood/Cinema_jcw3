import javax.persistence.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "person")
//@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Person implements Serializable
{
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long id;

  @Column(name = "fullname", nullable = false, length = 250)
  public String fullname;

  @Column(name = "email", nullable = false, length = 250)
  public String email;

  /*
    TODO: sha1
  @Column(name = "password", nullable = false)
  private String email;
  */
}