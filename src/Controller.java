import javax.persistence.*;

public class Controller
{
  private Person person = null;

  public void logIn()
  {
    final LoginView view = new LoginView();

    view.on("login", new Callback() {
        public void callback() {

          String email = view.getEmail();
          String password = view.getPassword();

          System.out.println("email: " + email + "; password: " + password);

          

          EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinema");
          EntityManager em = emf.createEntityManager();
          EntityTransaction userTransaction = em.getTransaction();
          userTransaction.begin();
          Person person = new Person();
          person.fullname = "Test user";
          person.email = "email";
          em.persist(person);
          userTransaction.commit();
          em.close();
          emf.close();
          System.out.println("done");
          System.exit(0);

          
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