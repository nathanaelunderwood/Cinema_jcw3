import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;

public abstract class View
{
  protected HashMap<String, Callback> events;
  protected static JFrame frame = null;
  protected static JPanel mainPanel = null;

  public View()
  {
    events = new HashMap<String, Callback>();

    if(frame == null)
      setupFrame();
    else
      clearMainPanel();
  }

  public void setupFrame()
  {
    frame = new JFrame("Cinema");
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new BorderLayout());
    JLabel title = new JLabel("Cinema");
    contentPane.add(title, BorderLayout.NORTH);

    mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());
    contentPane.add(mainPanel, BorderLayout.CENTER);

    frame.pack();
    frame.setVisible(true);
  }

  public void clearMainPanel()
  {
    
  }

  public void on(String eventName, Callback callback)
  {
    events.put(eventName, callback);
  }
}