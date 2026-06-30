package black.da;

import black.model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDA {
    public void save(Person person) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "javase", "java123"
        );
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into persons (id, name, family, age) values (?, ?, ? ,?)"
        );
        preparedStatement.setInt(1, person.getId());
        preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.setInt(4, person.getAge());

        preparedStatement.execute();
        preparedStatement.close();
        connection.close();
    }

    public void update(Person person) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "javase", "java123"
        );
        PreparedStatement preparedStatement = connection.prepareStatement(
                "update persons set name=?, family=?, age=? where id=?"
        );
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setInt(3, person.getAge());
        preparedStatement.setInt(4, person.getId());

        preparedStatement.execute();
        preparedStatement.close();
        connection.close();

    }

    public void delete(int id) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "javase", "java123"
        );

        PreparedStatement preparedStatement = connection.prepareStatement(
                "delete from persons where id=?"
        );
        preparedStatement.setInt(1, id);

        preparedStatement.execute();
        preparedStatement.close();
        connection.close();

    }
}
