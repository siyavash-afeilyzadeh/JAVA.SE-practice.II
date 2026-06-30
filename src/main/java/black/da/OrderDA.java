package black.da;

import black.model.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDA {
    public void save(Order order) throws SQLException{
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "javase", "java123"
        );

        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into orders (id, name, price, quantity) values (?, ?, ?, ?)"
        );
        preparedStatement.setInt(1, order.getId());
        preparedStatement.setString(2, order.getName());
        preparedStatement.setFloat(3, order.getPrice());
        preparedStatement.setInt(4, order.getQuantity());

        preparedStatement.execute();
        preparedStatement.close();
        connection.close();
    }

    public void update(Order order) throws SQLException{

    }

    public void delete(int id) throws SQLException{

    }
}
