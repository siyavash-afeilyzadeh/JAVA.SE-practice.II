package black.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Order {
    private int id;
    private String name;
    private float price;
    private int quantity;
}
