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
        preparedStatement.setInt(4,person.getAge());

        preparedStatement.execute();
        preparedStatement.close();
        connection.close();
    }

    public void update(Person person) {

    }

    public void delete(int id) {

    }
}
