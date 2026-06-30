package black.bl;

import black.da.PersonDA;
import black.model.Person;

import java.sql.SQLException;

public class PersonBLTest {
    public static void main(String[] args) throws SQLException {

            Person person1 = Person
                    .builder()
                    .id(1)
                    .name("John")
                    .family("Doe")
                    .age(34)
                    .build();
            System.out.println(person1);

        Person person2 = Person
                .builder()
                .id(2)
                .name("Richard")
                .family("Kennedy")
                .age(25)
                .build();
        System.out.println(person2);

            PersonBL personBL = new PersonBL();
            personBL.save(person1);
            personBL.save(person2);

        }
    }