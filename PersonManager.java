/**
 * Dumb stub. Should be a persistance EntityManager or whatever it's called.
 */
public class PersonManager
{
  public PersonManager()
  {

  }

  public Person loadByEmailAndPassword(String email, String password)
  {
    if(email.equals("email") && password.equals("password")) {
      Person person = new Person();
      person.id = 1;
      person.email = email;
      person.name = "Dummy User";
      return person;
    }

    return null;
  }
}