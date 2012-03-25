import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginView extends View
{
  JTextField email;
  JPasswordField password;
  JLabel message;

  public LoginView()
  {
    super();

    email = new JTextField("email");
    password = new JPasswordField("password");
    mainPanel.add(email);
    mainPanel.add(password);

    JButton loginLabel = new JButton("Log in to the cinema system");
    loginLabel.addActionListener(new LoginActionListener());
    mainPanel.add(loginLabel);

    message = new JLabel("message");
    mainPanel.add(message);

    frame.pack();
  }

  public String getEmail()
  {
    return email.getText();
  }

  public String getPassword()
  {
    return password.getText();
  }

  public void setMessage(String text)
  {
    System.out.println(message.getText());
    System.out.println(text);

    message.setText(text);
    System.out.println(message.getText());
    
    frame.repaint();
  }

  class LoginActionListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event) {
      Callback callback = events.get("login");
      if(callback != null)
        callback.callback();
    }
  }
}