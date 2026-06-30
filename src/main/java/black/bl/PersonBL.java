package black.bl;
import black.model.Person;
import black.da.PersonDA;

import java.sql.SQLException;

public class PersonBL {
    public void save(Person person) throws SQLException {
        PersonDA personDA = new PersonDA();
        if(person.getAge() >= 20 && person.getAge() <= 30){
            personDA.save(person);
            System.out.println("Person has been saved");
        }else{
            System.out.println("Age is not qualified");
        }
    };

    public void update (Person person) throws SQLException {
        PersonDA personDA = new PersonDA();
        personDA.update(person);
    };

    public void delete(int id) throws SQLException {
        PersonDA personDA = new PersonDA();
        personDA.delete(id);
    };


}
