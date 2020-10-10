import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ButtonActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Main.GET_COACH);
            while (resultSet.next()){
                System.out.print(resultSet.getInt("id" ));
                System.out.println(" "+resultSet.getString("name"));
            }
            connection.close();
            resultSet.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }
}
