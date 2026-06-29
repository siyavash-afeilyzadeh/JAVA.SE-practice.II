package black.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder

public class Person {
    private int id;
    private String name;
    private String family;
    private int age;

}
