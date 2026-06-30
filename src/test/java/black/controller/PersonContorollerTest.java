package black.controller;

import black.da.PersonDA;

public class PersonContorollerTest {
    public static void main(String[] args) {
//        PersonContoroller personContoroller = new PersonContoroller();
//        String outputMessage = personContoroller.save(1,"Steave","McCry",25);

        PersonContoroller personContoroller = new PersonContoroller();
        String outputMessage = personContoroller.delete(1);
    }
}
