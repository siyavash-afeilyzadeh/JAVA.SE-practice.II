package black.da;

import black.model.Person;
import black.da.PersonDA;

import java.sql.SQLException;
import java.text.ParseException;

public class PersonDATest {
    //    public static void main(String[] args) throws SQLException {
//        Person person = Person
//                .builder()
//                .id(1)
//                .name("John")
//                .family("Doe")
//                .age(34)
//                .build();
//        System.out.println(person);
//
//    PersonDA personDA = new PersonDA();
//    personDA.save(person);
//    System.out.println("Person Saved Successfully");
//    }
    public static void main(String[] args) throws SQLException {
        Person person = Person
                .builder()
                .id(1)
                .name("Simon")
                .family("McCry")
                .age(83)
                .build();
        System.out.println(person);

        PersonDA personDA = new PersonDA();
        personDA.update(person);
    }
}
