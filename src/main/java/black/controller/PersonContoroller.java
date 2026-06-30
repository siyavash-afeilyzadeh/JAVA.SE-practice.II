package black.controller;
import black.bl.PersonBL;
import black.model.Person;

public class PersonContoroller {
    public String save(int id, String name, String family, int age){
        try{
            Person  person = Person
                    .builder()
                    .id(id)
                    .name(name)
                    .family(family)
                    .age(age)
                    .build();
            PersonBL personBL = new PersonBL();
            personBL.save(person);
            return "Person Added Successfully";
        }catch (Exception e){
            return "ERROR " + e.getMessage();
        }
    }
    public String update(int id, String name, String family, int age){
        try{
            Person  person = Person
                    .builder()
                    .id(id)
                    .name(name)
                    .family(family)
                    .age(age)
                    .build();
            PersonBL personBL = new PersonBL();
            personBL.save(person);
            return "Successfully Updated";
        }catch (Exception e){
            return "ERROR " + e.getMessage();
        }
    }
    public String delete(int id){
        try{
            PersonBL personBL = new PersonBL();
            personBL.delete(id);
            return "Successfully Deleted";
        }catch (Exception e){
            return "ERROR " + e.getMessage();
        }
    }
}
