package black.da;

import black.model.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDA {
    public void save(Order order) throws SQLException {
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
        System.out.println("Order saved successfully");
    }

    public void update(Order order) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "javase", "java123"
        );

        PreparedStatement preparedStatment = connection.prepareStatement(
                "update orders set name = ?, price = ?, quantity = ? where id=?"
        );
        preparedStatment.setString(1, order.getName());
        preparedStatment.setFloat(2, order.getPrice());
        preparedStatment.setInt(3, order.getQuantity());
        preparedStatment.setInt(4, order.getId());

        preparedStatment.execute();
        preparedStatment.close();

        connection.close();
        System.out.println("Order updated successfully");
    }

    public void delete(int id) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "javase","java123"
        );

        PreparedStatement preparedStatement = connection.prepareStatement(
                "delete from orders where id=?"
        );
        preparedStatement.setInt(1,id);
        preparedStatement.execute();
        preparedStatement.close();

        connection.close();
        System.out.println("Order has been deleted");

    }
}
