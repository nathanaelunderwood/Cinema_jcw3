/**
 * Controller class.
 * 
 * @author (Nathanael Underwood) 
 * @version (1.0.0 - 18 Mar 2012)
 */

public class Controller
{
  private Person person = null;

  public void logIn()  //log in controller
  {
    //instantiates login view from view abstract class
    //view used in anonymous class therefore must be final
    final LoginView view = new LoginView(); 

	//login callback process when button is clicked
    view.on("login", new Callback() {
        public void callback() {

          String email = view.getEmail();
          String password = view.getPassword();

          System.out.println("email: " + email + "; password: " + password);

          
			//entity manager
          PersonManager manager = new PersonManager();
          	//replace with db interaction lines 
          	//referring to entity manager class
          person = manager.loadByEmailAndPassword(email, password);
          if(person != null) {
            viewBookings();
          }
          else {
            view.setMessage("Invalid credentials");
          }
        }
      });
  }

  public void viewBookings()
  {
    System.out.println("view bookings");
  }

  public static void main(String[] args)
  {
    Controller controller = new Controller();
    controller.logIn();
  }
}