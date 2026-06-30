package black.da;

import black.model.Order;

import java.sql.SQLException;

public class OrderDATest {
    public static void main(String[] args) throws SQLException {
        Order order = Order
                .builder()
                .id(1)
                .name("Mobile")
                .price(2300.55F)
                .quantity(2)
                .build();
        System.out.println(order);

        OrderDA orderDA = new OrderDA();
        orderDA.save(order);
    }
}
