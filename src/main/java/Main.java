import javax.swing.*;
import java.awt.*;

public class Main {
    public  static final String GET_COACH = "SELECT * FROM coach";
    public static JTable jt;

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        JFrame frame = new JFrame("Board");
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 3));
        //panel.setBackground(Color.BLUE);

        JButton button = new JButton("Coach");
        JButton button2 = new JButton("Customers");
        JButton button3 = new JButton("Train");
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        button.addActionListener(new ButtonActionListener());
        // frame.add(button,BorderLayout.PAGE_START);
        //frame.add(button2,BorderLayout.PAGE_END);
        frame.add(panel, BorderLayout.WEST);

        frame.setVisible(true);
    }


}
